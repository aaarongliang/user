package com.partner.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BasicDao extends SqlSessionDaoSupport{
	 @Resource
	    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
	        super.setSqlSessionFactory(sqlSessionFactory);
	    }
}
