package com.xworkz.shoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
		if(connection!= null) {
			System.out.println("connected,move on");
			Statement statement = connection.createStatement();
			String sqlQuery = "INSERT INTO shoe VALUES (3,'puma',700,'black',9.2)";
			int update = statement.executeUpdate(sqlQuery);
			System.out.println("number of rows Affected"+update);
			}
		else {
			System.out.println("not connected");
		}

	}

}

