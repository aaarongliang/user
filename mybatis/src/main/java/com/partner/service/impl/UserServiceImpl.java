package com.partner.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.partner.dao.UserDao;
import com.partner.model.User;
import com.partner.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	UserDao userDao;
	
	public List<User> getAllUser(){
		List<User> userList = userDao.findAllUser();
		for(User user:userList) {
			System.out.println("id="+user.getId()+" username="+user.getUsername()+" password="+user.getPassword());
		}
		return userList;
	}
	public User getUserById() {
		User user = userDao.findUserById(1);
		System.out.println("id="+user.getId()+" username="+user.getUsername()+" password="+user.getPassword());
		return user;
	}
	public int addUser() {
		return 1;
	}
	public int deleteUser() {
		return 1;
	}
	public int updateUser() {
		return 1;
	}
	
}
