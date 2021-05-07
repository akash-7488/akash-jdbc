package com.xworkz.shoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=null;
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
				Statement statement = connection.createStatement();
				String sql = "select * from shoe";
				ResultSet set = statement.executeQuery(sql);
				
				while (set.next()) {
					int id = set.getInt(1);
					System.out.println("S_id is       : " + id);
					String brand = set.getString(2);
					System.out.println("S_brand is    : " + brand);
					int price = set.getInt(3);
					System.out.println("S_price is    : "+ price);
					String color = set.getString(4);
					System.out.println("S_color is    : " + color);
					double size = set.getDouble(5);
					System.out.println("S_size is     : " + size);
					
					System.out.println("*********************************");
				}
			
		} finally {
			connection.close();
			System.out.println("connection closed");
		}
	}

}
