package com.xworkz.cosmatics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cosmatics {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
		if(conn!=null) {
			System.out.println("connected,move on");
			Statement statement = conn.createStatement();
			String sqlQery = "INSERT INTO cosmetic VALUES(3,'facewash','garnier',180,'female')";
			int update = statement.executeUpdate(sqlQery);
			System.out.println("number of rows Affected"+update);
			
		}
		else {
			System.out.println("not connected");
		}

	}

}
