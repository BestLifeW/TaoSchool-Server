package com.wtc433.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Update;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wtc433.domain.User;
import com.wtc433.service.UserService;
import com.wtc433.service.UserlikeService;


@Controller
@RequestMapping("/User")
public class UserController {
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserlikeService userlikeService;
	
	@ResponseBody
	@RequestMapping(value="/allUsers.do") //查询所有的用户 返回json//////
	public String allUsers() throws JsonGenerationException, JsonMappingException, IOException {
		List<User> findAll = userService.findAll();
		return objectMapper.writeValueAsString(findAll);
	}
	
	
	@ResponseBody
	@RequestMapping(value="/addUser.do") //注册用户
	public String addUser(User user) throws Exception {
		HashMap<String, String> msg = new HashMap<>();
		if (user.getUsername()!=null) {
			User databaseuser = userService.findUserByName(user.getUsername());
			if (databaseuser==null) {
				userService.insertUser(user);
				msg.put("msg","注册成功");
			}else{
				msg.put("msg", "注册失败,已存在账户");
			}
		}else {
			msg.put("msg", "请输入内容");
		}
		return objectMapper.writeValueAsString(msg);
	}
	
	
	@ResponseBody
	@RequestMapping("/update.do")
	public String updateUserPic(User user,MultipartFile pic) throws Exception{
		
		
		
		HashMap<String, String> msg = new HashMap<>();
		if (user.getId()!=null) {
			userService.updateUserById(user);
			msg.put("msg", "更新成功");
		}else {
			msg.put("msg", "请输入内容");
		}
		return objectMapper.writeValueAsString(msg);
		
		
	}
	
	@ResponseBody
	@RequestMapping("/updateUser.do")
	public String UpdateUser(User user) throws Exception{
		
		HashMap<String, String> msg= new HashMap<>();
		try {
			int updateUserById = userService.updateUserById(user);
			msg.put("msg", updateUserById+" ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  objectMapper.writeValueAsString(msg);
		
	}

	
	
	@ResponseBody
	@RequestMapping("/login.do")      //登录的方法
	public String Userlogin(@RequestParam("username") String username,
			@RequestParam("password")String password) throws Exception{
		System.out.println("用户名"+username+"密码"+password);
		HashMap<String, String> msg = new HashMap<>();
		User databaseuser = userService.findUserByName(username);
		//System.out.println("数据库密码"+databaseuser.getPassword());
		if (databaseuser!=null) {
			if (!databaseuser.getPassword().equals(password)) {
				msg.put("msg", "登录失败，密码错误");
			}else {
				msg.put("msg", "登录成功");
				return objectMapper.writeValueAsString(databaseuser);
			}
			
		}else {
			msg.put("msg", "登录失败，查无此人");
			return  objectMapper.writeValueAsString(msg);
		}
		return objectMapper.writeValueAsString(msg);
	}
	
	@RequestMapping(value = "/upload.do",method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam("file") MultipartFile user_pic,
            HttpServletRequest request) throws Exception{
		HashMap<String, String> msg = new HashMap<>();
         if (!user_pic.isEmpty()) {  
                try {  
                    if(username!=null){
                    	 User user = userService.findUserByName(username);
                    // 文件保存路径  
                    	 String originalName = user_pic.getOriginalFilename();
         				//上传文件处理
         				if(user_pic != null && originalName != null && originalName.length()>0){
         					//1、保存图片的物理路径
         					String store = "E:\\resources\\img\\";
         					
         					//2、新的图片名称
         					String picNewName = UUID.randomUUID()+originalName.substring(originalName.lastIndexOf("."));
         					
         					//3、新图片产生
         					File file = new File(store+picNewName);
         					
         					//4、将内存中的数据写入磁盘
         					user_pic.transferTo(file);
         					
         					
         					//获取项目的真实地址
         					String basePath = request.getContextPath()+"/img/";
         					//6、将图片名称写入User对象中
         					String RealPci = basePath+picNewName;
         					user.setIconpath(RealPci);
         					msg.put("msg", "上传成功");
         					
         				}
         				userService.updateUserById(user);
                    }
                } catch (Exception e) {  
                    e.printStackTrace();  
                    msg.put("msg", "上传失败");
                }  
         }
         return objectMapper.writeValueAsString(msg);}
	
	@RequestMapping(value="/getUserByName/{username}")
	@ResponseBody
	public String getUserByName(@PathVariable("username") String username) throws Exception{
		User databaseuser = userService.findUserByName(username);
		int countShopPubils = userService.CountShopPublish(username);
		long countUserLikeByUsername = userlikeService.countUserLikeByUsername(username);
		databaseuser.setLikecount((int) countUserLikeByUsername);
		databaseuser.setPublishcount(countShopPubils);
		return objectMapper.writeValueAsString(databaseuser);
		
	}
	
	@RequestMapping(value="/getUserById/{userid}")
	@ResponseBody
	public String getUserByName(@PathVariable("userid") Integer userid) throws Exception{
		User databaseuser = userService.findUserById(userid);
		int countShopPubils = userService.CountShopPublishById(userid);
		
		databaseuser.setPublishcount(countShopPubils);
		return objectMapper.writeValueAsString(databaseuser);
		
	}
	
}
