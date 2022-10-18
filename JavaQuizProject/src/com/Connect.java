package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.mysql.cj.xdevapi.Statement;

public class Connect
{
Connect conn = null;
{
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn= (Connect) DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema" , "root" ,"Kokanegy@0830");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
public PreparedStatement prepareStatement(String string) {
	// TODO Auto-generated method stub
	return null;
}
public Connect getConnection() {
	// TODO Auto-generated method stub
	return null;
}
public java.sql.Statement createStatement() {
	// TODO Auto-generated method stub
	return null;
}
}