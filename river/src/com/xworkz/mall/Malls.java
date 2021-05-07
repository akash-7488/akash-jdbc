package com.xworkz.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Malls {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root","Akash7488");
	  if(conn!=null) {
		  System.out.println("CONNECTED");
		  Statement stat = conn.createStatement();
		  String sqlquery = "insert into malls values(3,'mantri square','kempegouda',true,'08:00:00',7)";
		  int update = stat.executeUpdate(sqlquery);
		  System.out.println("no of rows affected" + update);
	  }else {
		  System.out.println("NOT CONNECTED");
	  }
	  

	}

}
