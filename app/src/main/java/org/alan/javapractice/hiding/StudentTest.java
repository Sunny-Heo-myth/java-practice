package org.alan.javapractice.hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.setStudentName("Sunny");
		// set method required for deal with value in reference data type as  target class
		
		System.out.println(studentLee.getStudentName());
	}
}
