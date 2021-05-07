package com.xworkz.river;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=null;
		try {
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
		Statement statement = connection.createStatement();
		String sql = "select * from riverdb";
		ResultSet set = statement.executeQuery(sql);

		while (set.next()) {
			
			int id = set.getInt(1);
			System.out.println("R_id is      : " + id);
			String name = set.getString(2);
			System.out.println("R_name is    : "+name);
			BigDecimal length = set.getBigDecimal(3);
			System.out.println("R_length is  : "+length);
			String origin = set.getString(4);
			System.out.println("R_origin is  : "+origin);
			boolean b = set.getBoolean(5);
			System.out.println("R_polluted   : "+b);
			
			System.out.println("********************************");

		}
		}finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}
}
