package org.alan.java.arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();        // create new instance 
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);                // .add(meth of ArrayList) to member variable
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subj : subjectList) {
			total += subj.getScorePoint();
			System.out.println(studentName + "'s " + subj.getName() + " score is " + 
			subj.getScorePoint() + ".");
		}
		System.out.println("Total score is " + total + ".");
	}
		
}
