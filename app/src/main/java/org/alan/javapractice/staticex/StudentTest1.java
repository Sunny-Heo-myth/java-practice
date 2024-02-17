package org.alan.javapractice.staticex;

public class StudentTest1 {
	
 public static void main(String[] args) {
	 
	 Student studentHeo = new Student();
	 studentHeo.setStudentName("Sunny Heo");
	 System.out.println(Student.serialNum);

	 
	 Student studentLizi = new Student();
	 studentLizi.setStudentName("lily Lizi");
	 System.out.println(Student.serialNum);
 }
}
