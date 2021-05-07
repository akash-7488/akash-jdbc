package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverApplicaton {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/river", "root", "Akash7488");
		
		if(conn!=null) {
			System.out.println("connected to db, move to next step");
			Statement statement = conn.createStatement();
			String sqlQuery = "INSERT INTO riverdb VALUES (5,'bramhaputra',1700.4,'manasasarovar',0)";
			int totalRowsAffected = statement.executeUpdate(sqlQuery);
			System.out.println("totalRowsAffected"+totalRowsAffected );
			}
		else {
			System.out.println("not connected");
		}
		

	}

}
