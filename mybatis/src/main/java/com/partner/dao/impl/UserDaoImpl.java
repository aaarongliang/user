package com.partner.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.partner.dao.UserDao;
import com.partner.model.User;

@Repository(value="userDao")
public class UserDaoImpl extends BasicDao implements UserDao{
	
	public List<User> findAllUser(){
		
		return new ArrayList<User>();
	}
	
	public User findUserById(int id) {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("userDaoMapper.findUserById", 1);
		return user;
	}
	
	public int addUser(User user) {
		return 1;
	}
	
	public int deleteUser(@Param("id") int id) {
		return 1;
	}
	
	public int updateUser(User user) {
		return 1;
	}
}
