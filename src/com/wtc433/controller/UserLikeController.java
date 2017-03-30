package com.wtc433.controller;

import java.nio.channels.ScatteringByteChannel;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wtc433.domain.User;
import com.wtc433.domain.Userlike;
import com.wtc433.service.UserlikeService;

@Controller
@RequestMapping("/UserLike")
public class UserLikeController {

	ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private UserlikeService userlikeService;

	@ResponseBody
	@RequestMapping(value = "/getUserLikeByUsername/{username}", method = RequestMethod.GET)
	public String getUserLikeByUsername(@PathVariable("username") String username) throws Exception {
		List<Userlike> userlikes = userlikeService.getLikeByUserName(username);
		return objectMapper.writeValueAsString(userlikes);
	}

	// 点赞的方法
	@ResponseBody
	@RequestMapping("/addUserlike.do")
	public String addUserLike(Userlike userlike) throws Exception {
		HashMap<String, String> map = new HashMap<>();
		boolean addlike = userlikeService.addlike(userlike);
		if (addlike) {
			map.put("msg", "点赞成功");
		} else {
			map.put("msg", "点赞失败");
		}
		return objectMapper.writeValueAsString(map);
	}

	// 判断是否有赞，有加上，没有 删除
	@ResponseBody
	@RequestMapping("/isLove.do")
	public String isLove(Userlike userlike) throws Exception {
		String havaLove = userlikeService.isHavaLove(userlike);
		return havaLove;

	}

	@ResponseBody
	@RequestMapping(value = "/isLoveShow.do/{username}/{shopid}", method = RequestMethod.GET)
	public String isloveShow(@PathVariable("username") String username, @PathVariable("shopid") Integer shopid)
			throws Exception {
		Userlike userlike = new Userlike();
		userlike.setShopid(shopid);
		userlike.setUsername(username);
		String havaLoveShow = userlikeService.isHavaLoveShow(userlike);
		return havaLoveShow;
	}

	@ResponseBody
	@RequestMapping(value = "/countUserLove/{username}", method = RequestMethod.GET)
	public String countUserLove(@PathVariable("username") String username) throws Exception {
		long countUserLove = userlikeService.countUserLikeByUsername(username);
		return countUserLove + "";
	}
}
