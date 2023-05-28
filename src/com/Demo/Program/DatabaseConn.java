package com.Demo.Program;

import java.sql.DriverManager;

public class DatabaseConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("MySQL Connect Example.");
		  java.sql.Connection conn = null;
		  //String url="jdbc:sqlserver://localhost:3306/";
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "demodb";
		  //String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "root";
		  try {
		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Connected to the database");
		  conn.close();
		  System.out.println("Disconnected from database");
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
	}

}
