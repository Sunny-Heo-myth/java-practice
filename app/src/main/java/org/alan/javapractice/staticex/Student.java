package org.alan.javapractice.staticex;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentname() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	@Override
	public String toString() {
		return studentID + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(this.studentID == std.studentID)
				return true;
			else return false;
		}
		return false;
	}
}
