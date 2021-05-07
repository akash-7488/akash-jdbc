package com.xworkz.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MallsUpdate {

	
			public static void main(String[] args) throws ClassNotFoundException, SQLException {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root","Akash7488");
			  if(conn!=null) {
				  System.out.println("CONNECTED");
				  Statement stat = conn.createStatement(); 
				  String sqlQuery = "UPDATE malls SET M_NAME = 'GT' WHERE M_ID = 2";
					int totalRowsUpdated = stat.executeUpdate(sqlQuery);
					System.out.println("totalRowsUpdated :" + totalRowsUpdated);
					conn.close();
				  
				  
			  }else {
				  System.out.println("NOT CONNECTED");
			  }
			  

	  }

}
