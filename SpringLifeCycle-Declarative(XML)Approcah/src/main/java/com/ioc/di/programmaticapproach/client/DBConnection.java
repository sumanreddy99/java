package com.ioc.di.programmaticapproach.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBConnection {

	private Connection con;
	private String drivers;
	private String url;
	private String userName;
	private String password;
	
	
	
public void setDrivers(String drivers) {
		this.drivers = drivers;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}


public void conIntMethod() throws Exception {
	
	Class.forName(drivers);
	con= DriverManager.getConnection(url,userName,password);
	
	System.out.println("coonection opened");
}

public void save(int userId,String username) throws SQLException {
	
PreparedStatement pstmt	=con.prepareStatement("insert into student values(?,?)");

pstmt.setInt(1, userId);
pstmt.setString(2, username);
//pstmt.setString(3, password);

pstmt.executeUpdate();

System.out.println("insert into values success");
}


	public void conDestroyMethod() throws Exception {
		con.close();
		System.out.println("connection closed");

}
}

