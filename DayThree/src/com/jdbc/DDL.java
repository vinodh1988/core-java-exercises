package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL {
   public static void main(String[] args) {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sterling","root","password");
	    Statement s=connection.createStatement();
	   // s.executeUpdate("create table firsttab(sno int primary key, name varchar(30),city varchar(30))");
	    //System.out.println("Table is created");
	    s.executeUpdate("insert into firsttab values(2,'Rakesh','Chennai')");
	    System.out.println("Inserted");
	  } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
