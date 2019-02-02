package com.partner.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.partner.model.User;
import com.partner.service.UserService;

@Controller
public class UserController {
	@Resource(name="userService")
	UserService userService;
	@RequestMapping("/login")
	public String login(String name,String password)
	{
//		List<User> userList = userService.getAllUser();
//		for(User user:userList) {
//			System.out.println("id="+user.getId()+" username="+user.getUsername()+" password="+user.getPassword());
//		}
		User user = userService.getUserById();
		System.out.println("id="+user.getId()+" username="+user.getUsername()+" password="+user.getPassword());
		return "list";
	}
}
