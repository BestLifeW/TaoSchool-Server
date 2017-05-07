package com.wtc433.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wtc433.domain.Shop;
import com.wtc433.domain.ShopExt;
import com.wtc433.domain.SubmitDetail;
import com.wtc433.service.OrderService;
import com.wtc433.service.ShopService;

@Controller
@RequestMapping("/Shop")
public class ShopController {

	ObjectMapper objectMapper = new ObjectMapper();
	@Autowired
	private ShopService shopservice;
	
	@Autowired
	private OrderService orderService;
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
		System.out.println("接收到"+username);
		List<ShopExt> shops = shopservice.findShopByUserName(username);
		return objectMapper.writeValueAsString(shops);

	}

	@ResponseBody
	@RequestMapping("/getShopByShopID/{shopid}")
	public String getShopName(@PathVariable("shopid") Integer shopid) throws Exception {
		ShopExt shops = shopservice.findShopByShopId(shopid);
		return objectMapper.writeValueAsString(shops);
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
	
	//根据id删除商品
	@ResponseBody
	@RequestMapping(value="/delShopBuId/{shopid}")
	public String delShopByid(@PathVariable("shopid") int shopid) throws Exception{
		System.out.println("接收删除的数据,商品id"+shopid);
		HashMap<String, String> map = new HashMap<>();
		try {
			shopservice.deleteShopById(shopid);
			map.put("msg", "删除成功");
		} catch (Exception e) {
			map.put("msg", "删除失败");
		}
		return objectMapper.writeValueAsString(map);
	}
	
	//根据商品种类获得商品数据
	@ResponseBody
	@RequestMapping("/getShopsByCategory/{category}")
	public String getallShopAndUser(@PathVariable("category") String category) throws Exception {
		
		List<ShopExt> shopExts = shopservice.findShopByCategory(category);
		for (ShopExt shopExt : shopExts) {
			System.out.println(shopExt.toString());
		}
		return objectMapper.writeValueAsString(shopExts);
	}
}
