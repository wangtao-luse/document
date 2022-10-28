package com.explore.member.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Driver;

public class TestMysql {
	@Test
public void testMysql() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {	
		//通过反射的方式获取Driver对象
				Driver driver=(Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				//调用DriverManager的registerDriver(Driver driver)方法注册驱动
				DriverManager.registerDriver(driver);
				//提供账号、密码和URL
				String user="root";
				String password="mysql@958958";
				String url="jdbc:mysql://1.116.226.147:3306/itour?serverTimezone=UTC";
				//调用DriverManager的getConnection()方法来获取连接
				Connection connect=DriverManager.getConnection(url,user,password);
				System.out.println(connect);
	            connect.close();


}
}
