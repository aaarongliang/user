package com.partner.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// 获取数据库连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parter", "root", "YuLiang127");
		// 获取执行sql语句的对象   执行sql语句
		Statement st = conn.createStatement();
		String sql = "select * from t_user";
		// 执行 返回 结果集对象  set集合去重
		ResultSet resultSet = st.executeQuery(sql);
		while (resultSet.next()) {
			// int id =resultSet.getInt(1);
			String id = resultSet.getString(1);
			String name = resultSet.getString("user_name");
			// 可输入列数，也可以说输入列的名称
			// 当我去封装结果集的时候再去转换products
			System.out.println(id + ":" + name);
		}
	
	}
}
