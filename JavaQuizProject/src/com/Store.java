package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
public class Store<Mcq> {
	int id ;
	String name = null;
	int score ;
	Connect conn = null;
	PreparedStatement ps = null;

	public void insertData(int ld, String name, int score) {
		try {
			HashMap hm = new HashMap<>();
			Connect connection = new Connect();
			conn = connection.getConnection();
			Statement Statement = (Statement) conn.createStatement();
	        String sql;
	        sql = "select *from quiz";
	        ResultSet resultSet = ((java.sql.Statement) Statement).executeQuery(sql);
			ps = conn.prepareStatement("insert into score(Id,StudentName,score)values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, score);
			int i = ps.executeUpdate();
			System.out.println("Record is insert successufully " + i);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				((Connection) conn).close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void doProcess() {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("id");
			id = sc.nextInt();
			System.out.println("Enter user Name");
			name = sc.next();
			System.out.println("Score");
			score= sc.nextInt();
			Store thisclass = new Store();
			thisclass.insertData(id, name, score);
		}
	}
	public static void main(String[] args) {
		Store obj = new Store();
		obj.doProcess();
		
	}

}
