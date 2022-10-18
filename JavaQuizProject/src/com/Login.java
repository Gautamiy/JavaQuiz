package com;
import com.Connect;
import com.Store;

import java.util.ArrayList;
import java.util.Scanner;
import com.Quiz;
import com.Question;
public class Login {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String username;
	    String password;
	    System.out.println("Log in:");
	    System.out.println("username: ");
	    username = input.next();
	    System.out.println("password: ");
	    password = input.next();
	    String user;
	    //users check = new users(username, password);

	    if(username.equals(username) && password.equals(password)) 
	        System.out.println("You are logged in");
	     Quiz q= new Quiz();
		 q.start();
		 q.close();
		 q.StudentName(username);
		 Object numCorrect = null;		 
	}
	public void m1() {
		int user=0;
		System.out.println("Enter your name");
		Scanner sc= new Scanner(System.in);
		String StudentName= sc.next();
		System.out.println(" Number of Users " + user);
		Login.saveName(StudentName);
	}
	  private static void saveName(String StudentName) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add(StudentName);
		for(String s1:al)
		{
			System.out.println(s1);
		}
	}
	

	}