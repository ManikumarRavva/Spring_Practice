package com.mkyong.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String, String> answers;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void displayInfo(){
		System.out.println("Question id"+id);
		System.out.println("Question name"+name);
		System.out.println("Answers...");
		
		Set<Entry<String,String>> set = answers.entrySet();
		
		Iterator<Entry<String,String>> iterator =set.iterator();
		
		while(iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			System.out.println("Answer"+entry.getKey()+"Posted by="+entry.getValue());
		}
		
 	}
}
