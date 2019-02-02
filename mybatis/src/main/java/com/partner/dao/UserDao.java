package com.partner.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.partner.model.User;

public interface UserDao {
	
	public List<User> findAllUser();
	
	public User findUserById(@Param("id") int id);
	
	public int addUser(User user);
	
	public int deleteUser(@Param("id") int id);
	
	public int updateUser(User user);
}
