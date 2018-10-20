package com.rhino.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.rhino.test.SpringTestCase;
import com.rhino.entry.User;

public class UserServiceTest extends SpringTestCase {

	@Autowired
	private UserService userService;

	@Test
	public void selectUserByIdTest() {
		User user = userService.selectUserById(1);
		System.out.println("user_name:" + user.getUserName() + ", user_password:" + user.getUserPassword());
	}
}
