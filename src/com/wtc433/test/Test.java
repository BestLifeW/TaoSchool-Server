package com.wtc433.test;

import com.wtc433.service.UserService;
import com.wtc433.service.impl.UserServiceImpl;

public class Test {
	
	
	
	@org.junit.Test
	public void getDemo(){
		
		UserService userService = new UserServiceImpl();
		userService.CountShopPublish("lovec");
	}

}
