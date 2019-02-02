package com.partner.service;

import java.util.List;

import com.partner.model.User;
public interface UserService{
	
	public List<User> getAllUser();
	public User getUserById();
	public int addUser();
	public int deleteUser();
	public int updateUser();
	
}
