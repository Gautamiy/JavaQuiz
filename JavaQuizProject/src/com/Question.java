package com;
import java.util.ArrayList;
import java.util.Collections;
public class Question {
	private String que;
	private ArrayList<String>choices;
	private String ans;
	public Question(String que, String[] choices, String ans) {
		this.que=que;
		this.choices= new ArrayList<String>();
		for(int i=0;i<choices.length;i++) {
			this.choices.add(choices[i]);
		}
		this.ans=ans;
	}
	public String getQuestion(){
		return que;
	}
	public ArrayList<String>getchoices(){
		return choices;
	}
	public String getAnswer() {
		return ans;
	}

}
