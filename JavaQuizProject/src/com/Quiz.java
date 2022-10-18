package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
   private ArrayList<Question>questionSet;
   public Quiz() {
	   questionSet= new ArrayList<Question>();
	   String q = "Which of the following option leads to the portability and security of Java?\n";
	   String[] a= {"a.Bytecode is executed by JVM",
			        "b.The applet makes the Java code secure and portable",
			        "c.Use of exception handling",
			        "d.Dynamic binding between objects"};
	   questionSet.add(new Question(q,a,"Bytecode is executed by JVM"));
	    q = "Which of the following is not a Java features?\n";
	    a =new String[] { "a.Dynamic",
				 "b.Architecture Neutral",
				 "c.Use of pointers",
				 "d.Object-oriented"};
	   questionSet.add(new Question(q,a,"c.Use of pointers"));
	   q = "What is the return type of the hashCode() method in the Object class?\n";
	   a =new String[] { "a.Object",
				 "b.int",
				 "c.long",
				 "d.void"};
	   questionSet.add(new Question(q,a,"b.int"));
	   q = "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?\n";
	   a =new String[] { "a.getClass()",
	   					"b.intern()",
	   					"c.getName()",
	   			        "d.toString()"};
	   questionSet.add(new Question(q,a,"c.getName()"));
	   q = "In character stream I/O, a single read/write operation performs _____.\n";
	   a =new String[] { "a.Two bytes read/write at a time.",
				  "b.Eight bytes read/write at a time.",
				  "c.One byte read/write at a time.",
				  "d.Five bytes read/ write at a time."};
	   questionSet.add(new Question(q,a,"a.Two bytes read/write at atime"));
	   q = "What is the default encoding for an OutputStreamWriter?\n";
	   a =new String[] { "a.UTF-8",
	   	 			"b.Default encoding of the host platform",
	   				"c.UTF-12",
	   				"d.None of the above"};
	   questionSet.add(new Question(q,a,"b.Default encoding for the platform"));
	   q = "In which process, a local variable has the same name as one of the instance variables?\n";
	   a =new String[] { "a.Serialization",
				      "b.Variable Shadowing",
				      "c.Abstraction",
				      "d.Multi-threading"};
	   questionSet.add(new Question(q,a,"b.Variable Shadowing"));
	   q = "Which of the following is true about the anonymous inner class?\n";
	   a =new String[] { "a.It has only methods",
	   		 			"b.Objects can't be created",
	   					"c.It has a fixed class name" ,
	   					"d.It has no class name"};
	   questionSet.add(new Question(q,a,"d.It has no class name"));
	   q = "Which package contains the Random class?\n";
	   a =new String[] {"a.java.util package",
				  "b.java.lang package",
				  "c.java.awt package",
				  "d.java.io package"};
	   questionSet.add(new Question(q,a,"a.java.util package"));
	   q = "If three threads trying to share a single object at the same time, which condition will arise in this scenario?\n";
	   a =new String[] { "a.Time-Lapse",
				 "b.Critical situation",
				 "c.Race condition",
				 "d.Recursion"};
	   questionSet.add(new Question(q,a,"a.Time Lapse"));
	   Collections.shuffle(questionSet,new Random());
   }
   public void start() {
	   Scanner sc= new Scanner(System.in);
	   int numCorrect=0;
	   for(int que=0;que<questionSet.size();que++) {
		   System.out.print(questionSet.get(que).getQuestion());
		   
		   int numchoices=questionSet.get(que).getchoices().size();
		   for (int choice=0; choice<numchoices;choice++) {
			   System.out.println((choice+1)+
			   questionSet.get(que).getchoices().get(choice));
		   }
		   int quizAns=sc.nextInt();
		   ArrayList<String> choiceSet=questionSet.get(que).getchoices();
		   String correctAns=questionSet.get(que).getAnswer();
		   int correctAnsIndex= choiceSet.indexOf(correctAns);
		   if(quizAns == correctAnsIndex + 1) {
			   numCorrect++;
		   }
		}
	   sc.close();
	   System.out.println("your score "+numCorrect);
   if(numCorrect>=8 && numCorrect<=10)
	{
		System.out.println("Class A");
		
	}
	else if(numCorrect>=6 && numCorrect<8) {
		System.out.println(" Class B ");
	}
	else if(numCorrect == 5)
	{
		System.out.println(" Class C ");
	}
	else
	{
		System.out.println("FAIL");
	}
	
}
   public void close() {
	   System.out.println("Log Out");
   }
   public void StudentName(Object username) {
	   ArrayList al = new ArrayList<String>();
	     al.add(username);
		
   }
   
}
