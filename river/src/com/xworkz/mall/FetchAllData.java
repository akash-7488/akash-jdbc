package com.xworkz.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

public class FetchAllData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
			Statement statement = connection.createStatement();
			String sql = "select * from malls";
			ResultSet set = statement.executeQuery(sql);
			
			while (set.next()) {
				int id = set.getInt(1);
				System.out.println("M_id is        : "+id);
				String name = set.getString(2);
				System.out.println("M_name is      : "+name);
				String location = set.getString(3);
				System.out.println("M_location is  : "+location);
				boolean open = set.getBoolean(4);
				System.out.println("M_open         : "+open);
				Time timing = set.getTime(5);
				System.out.println("M_timing is    : "+timing);
				int rating = set.getInt(6);
				System.out.println("M_rating is    : "+rating);
				
				System.out.println("********************************");
				
			}
			
			
			
		} finally {
			connection.close();
			System.out.println("connection closed ....");
		}
	}

}
