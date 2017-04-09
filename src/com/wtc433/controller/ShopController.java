package com.wtc433.controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExt;
import com.wtc433.domain.SubmitDetail;
import com.wtc433.service.ShopService;

@Controller
@RequestMapping("/Shop")
public class ShopController {

	ObjectMapper objectMapper = new ObjectMapper();
	@Autowired
	private ShopService shopservice;
	private String path;

	@ResponseBody
	@RequestMapping("/addShop.do")
	public String addShop(Shop shop, @RequestParam("file") MultipartFile user_pic, HttpServletRequest request)
			throws Exception {
		System.out.println("准备商品上传接收到Shop"+shop.toString());
		HashMap<String, String> msg = new HashMap<>();
		if (shop.getShopname() != null) {
			if (!user_pic.isEmpty()) {
				String originalName = user_pic.getOriginalFilename();
				// 上传文件处理
				if (user_pic != null && originalName != null && originalName.length() > 0) {
					// 1、保存图片的物理路径
					String store = "E:\\resources\\img\\";

					// 2、新的图片名称
					String picNewName = UUID.randomUUID() + originalName.substring(originalName.lastIndexOf("."));

					// 3、新图片产生
					File file = new File(store + picNewName);

					// 4、将内存中的数据写入磁盘
					user_pic.transferTo(file);

					// 获取项目的真实地址
					String basePath = request.getContextPath() + "/img/";
					// 6、将图片名称写入User对象中
					String RealPci = basePath + picNewName;
					shop.setPicture(RealPci);
					msg.put("msg", "上传成功");
				}

			}
			shopservice.insertShop(shop);
			msg.put("msg", "商品发布成功");
		} else {
			msg.put("msg", "请输入内容");
		}
		return objectMapper.writeValueAsString(msg);
	}

	@ResponseBody
	@RequestMapping("/allShop.do")
	public String getAllShop() throws Exception {
		List<Shop> allShop = shopservice.findAll();
		return objectMapper.writeValueAsString(allShop);
	}

	@ResponseBody
	@RequestMapping("/allShopAndUser.do")
	public String getallShopAndUser() throws Exception {
		List<ShopExt> allShopAndUser = shopservice.findShopAndUser();
		return objectMapper.writeValueAsString(allShopAndUser);
	}

	@ResponseBody
	@RequestMapping("/getShopByUserName/{username}")
	public String getShopByUserName(@PathVariable("username") String username) throws Exception {
		List<Shop> shops = shopservice.findShopByUserName(username);
		return objectMapper.writeValueAsString(shops);

	}

	@ResponseBody
	@RequestMapping("/getShopByShopID/{shopid}")
	public String getShopName(@PathVariable("shopid") Integer shopid) throws Exception {
		ShopExt shops = shopservice.findShopByShopId(shopid);
		return objectMapper.writeValueAsString(shops);
	}
	
	
	@RequestMapping("/upload")
	public void upLoad(HttpServletRequest request,HttpServletResponse response)
			throws IOException {
		response.setContentType("textml;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		// 创建文件项目工厂对象
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 设置文件上传路
		String upload ="F:\\serviceImgResources\\img"; 

		// 获取系统默认的临时文件保存路径，该路径为Tomcat根目录下的temp文件夹
		String temp =request.getSession().getServletContext().getRealPath("/");
		// 设置缓冲区大小为 5M
		factory.setSizeThreshold(1024 * 1024 * 5);
		// 设置临时文件夹为temp
		factory.setRepository(new File(upload));
		// 用工厂实例化上传组件,ServletFileUpload 用来解析文件上传请求
		ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
		request.getInputStream();

		// 解析结果放在List中
		try {
			List<FileItem> list = servletFileUpload.parseRequest(request);

			for (FileItem item : list) {
				String name = item.getFieldName();
				InputStream is = item.getInputStream();

				if (name.contains("content")) {
					System.out.println(inputStream2String(is));
				} else if (name.contains("img")) {
					try {
						path = upload + "\\" + item.getName();
						inputStream2File(is, path);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			out.write(path); // 这里我把服务端成功后，返回给客户端的是上传成功后路径
		} catch (FileUploadException e) {
			e.printStackTrace();
			System.out.println("failure");
			out.write("failure");
		}

		out.flush();
		out.close();
	}

	// 流转化成字符串
	public static String inputStream2String(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
			baos.write(i);
		}
		return baos.toString();
	}

	// 流转化成文件
	public static void inputStream2File(InputStream is, String savePath)
			throws Exception {
		System.out.println("文件保存路径为:" + savePath);
		File file = new File(savePath);
		InputStream inputSteam = is;
		BufferedInputStream fis = new BufferedInputStream(inputSteam);
		FileOutputStream fos = new FileOutputStream(file);
		int f;
		while ((f = fis.read()) != -1) {
			fos.write(f);
		}
		fos.flush();
		fos.close();
		fis.close();
		inputSteam.close();

	}
	//根据ID删除商品
	@ResponseBody
	@RequestMapping(value="/deleteShopById/{shopid}")
	public String delShopById(@PathVariable("shopid") int shopid) throws Exception{
		System.out.println("接收要删除的ShopId" + shopid);
		HashMap<String, String> msg = new HashMap<>();
		try {
			shopservice.deleteShopById(shopid);
			msg.put("msg", "数据删除成功");
		} catch (Exception e) {
			msg.put("msg", "数据删除失败");
		}
		
		return objectMapper.writeValueAsString(msg);
	}
	
	//根据商品ID和用户姓名 来获取提交的订单前的消息
	@ResponseBody
	@RequestMapping(value="/getSubmit/{shopid}/{username}")
	public String getSubmit(@PathVariable("shopid") int shopid,@PathVariable("username") String username) throws Exception{
		System.out.println("接收到数据,商品id"+shopid+",用户姓名:"+username);
		HashMap<String, String> map = new HashMap<>();
		try {
			SubmitDetail submitDetail = shopservice.findSubmitDetailByShopIdAndUsername(shopid, username);
			return objectMapper.writeValueAsString(submitDetail);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	
}
