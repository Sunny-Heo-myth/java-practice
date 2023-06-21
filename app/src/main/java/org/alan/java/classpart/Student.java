package org.alan.java.classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String toString() {
		return studentName + "," + studentID;
	}
	
	public static void main(String[ ] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "Sunny";
	
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		System.out.println(studentAhn.toString());
	}
}
