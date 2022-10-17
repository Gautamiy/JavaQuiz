package com;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDemo
{
ConnectionDemo conn = null;
public ConnectionDemo getConnection()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn= (ConnectionDemo) DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz" , "root" ,"Kokanegy#0830");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn ;

}
public PreparedStatement prepareStatement(String string) {
	// TODO Auto-generated method stub
	return null;
}
}