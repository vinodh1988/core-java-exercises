package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DML {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sterling","root","password");
		    PreparedStatement p=connection.prepareStatement(
		    		"insert into firsttab values(?,?,?) ");
	  String x="yes";
	  do {
		  System.out.println("Enter sno");
		  int sno = Integer.parseInt(sc.next());
		  System.out.println("Enter Name");
		  String name=sc.next();
		  System.out.println("Enter City");
		  String city=sc.next();
		  p.setInt(1, sno);
		  p.setString(2, name);
		  p.setString(3, city);
		  
		  p.executeUpdate();
		  System.out.println("inserted "+sno);
		  System.out.println("Do you want to continue(yes/no)");
		  x=sc.next();
	  }while(x.equals("yes"));
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
   }
}
