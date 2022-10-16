package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
   private ArrayList<Question>questionSet;
   public Quiz() {
	   questionSet= new ArrayList<Question>();
	   String q1 = "Which of the following option leads to the portability and security of Java?\n";
	   String[] a= {".Bytecode is executed by JVM\n"+
			        "b.The applet makes the Java code secure and portable\n"+
			        "c.Use of exception handling\n"+
			        "d.Dynamic binding between objects\n"};
	   questionSet.add(new Question(q1,a,"Bytecode is executed by JVM"));
	   String q2 = "Which of the following is not a Java features?\n";
	   a =new String[] { "a.Dynamic\n"+
				 "b.Architecture Neutral\n"+
				 "c.Use of pointers\n"+
				 "d.Object-oriented\n"};
	   questionSet.add(new Question(q2,a,"c.Use of pointers"));
	   String q3 = "What is the return type of the hashCode() method in the Object class?\n";
	   a =new String[] { "a.Object\n"+
				 "b.int\n"+
				 "c.long\n"+
				 "d.void\n"};
	   questionSet.add(new Question(q3,a,"b.int"));
	   String q4 = "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?\n";
	   a =new String[] { "a.getClass()\n"+
	   					"b.intern()\n"+
	   					"c.getName()\n"+
	   			        "d.toString()\n"};
	   questionSet.add(new Question(q4,a,"c.getName()"));
	   String q5 = "In character stream I/O, a single read/write operation performs _____.\n";
	   a =new String[] { "a.Two bytes read/write at a time.\n"+
				  "b.Eight bytes read/write at a time.\n"+
				  "c.One byte read/write at a time.\n"+
				  "d.Five bytes read/ write at a time."};
	   questionSet.add(new Question(q5,a,"a.Two bytes read/write at atime"));
	   String q6 = "What is the default encoding for an OutputStreamWriter?\n";
	   a =new String[] { "\"a.UTF-8\n"+
	   	 			"b.Default encoding of the host platform\n"+
	   				"c.UTF-12\n"+
	   				"d.None of the above\n"};
	   questionSet.add(new Question(q6,a,"b.Default encoding for the platform"));
	   String q7 = "In which process, a local variable has the same name as one of the instance variables?\n";
	   a =new String[] { "a.Serialization\n"+
				      "b.Variable Shadowing\n"+
				      "c.Abstraction\n"+
				      "d.Multi-threading"};
	   questionSet.add(new Question(q7,a,"b.Variable Shadowing"));
	   String q8 = "Which of the following is true about the anonymous inner class?\n";
	   a =new String[] { "a.It has only methods\n"+
	   		 			"b.Objects can't be created\n"+
	   					"c.It has a fixed class name\n" +
	   					"d.It has no class name"};
	   questionSet.add(new Question(q8,a,"d.It has no class name"));
	   String q9 = "Which package contains the Random class?\n";
	   a =new String[] {"a.java.util package\n"+
				  "b.java.lang package\n"+
				  "c.java.awt package\n"+
				  "d.java.io package\n"};
	   questionSet.add(new Question(q9,a,"a.java.util package"));
	   String q10 = "If three threads trying to share a single object at the same time, which condition will arise in this scenario?\n";
	   a =new String[] { "a.Time-Lapse\n"+
				 "b.Critical situation\n"+
				 "c.Race condition\n"+
				 "d.Recursion\n"};
	   questionSet.add(new Question(q10,a,"a.Time Lapse"));
	   Collections.shuffle(questionSet,new Random());
   }
   public void start() {
	   Scanner sc= new Scanner(System.in);
	   int numCorrect=0;
	   for(int que=0;que<questionSet.size();que++) {
		   System.out.print(questionSet.get(que).getQuestion());
		   
		   int numchoices=questionSet.get(que).getchoices().size();
		   for (int choice=0; choice<numchoices;choice++) {
			   System.out.println((choice)+
			   questionSet.get(que).getchoices().get(choice));
		   }
		   String quizAns=sc.nextLine();
		   ArrayList<String> choiceSet=questionSet.get(que).getchoices();
		   String correctAns=questionSet.get(que).getAnswer();
		   int correctAnsIndex= choiceSet.indexOf(correctAns);
		   if(quizAns == correctAns + 1) {
			   numCorrect++;
		   }
		}
	   sc.close();
	   System.out.println("your score"+numCorrect);
   }
}
