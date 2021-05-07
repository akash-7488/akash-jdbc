package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
		
		if(conn!=null) {
			System.out.println("connected to db, move to next step");
			Statement statement = conn.createStatement();
			String sqlQuery = "DELETE FROM riverdb WHERE R_ID=5";
			int totalRowsUpdated = statement.executeUpdate(sqlQuery);
			System.out.println("totalRowsUpdated :" + totalRowsUpdated);
			conn.close();
			}
		else {
			System.out.println("not connected");
		}
		

	}

}

