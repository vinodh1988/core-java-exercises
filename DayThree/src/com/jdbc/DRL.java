package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class DRL {
  public static void main(String[] args) {
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sterling","root","password");
		    Statement s=connection.createStatement();
		    ResultSet rs=s.executeQuery("select * from firsttab");
		    ResultSetMetaData meta =rs.getMetaData();
		    System.out.println(meta.getColumnName(1)+"      "+meta.getColumnName(2)+"  "+meta.getColumnName(3));
		    System.out.println("-------------------------------------------------------------------");
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		    }
		   }
	  catch(Exception e) 
	  {
		  e.printStackTrace();
	  }
}
}
