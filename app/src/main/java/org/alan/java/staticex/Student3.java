package org.alan.java.staticex;

public class Student3 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int cardNo;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNo = serialNum + 100;
	}
	
	public String getStudentname() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}