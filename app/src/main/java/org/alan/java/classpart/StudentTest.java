package org.alan.java.classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "Sunny";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
