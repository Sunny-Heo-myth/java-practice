package org.alan.java.staticex;

public class StudentTest2 {
	
 public static void main(String[] args) {
	 Student studentHeo = new Student();
	 studentHeo.setStudentName("Sunny Heo");
	 System.out.println(Student.serialNum);
	 System.out.println(studentHeo.studentName + " StudentNumber : " + studentHeo.studentID);
	 
	 Student studentLizi = new Student();
	 studentLizi.setStudentName("lily Lizi");
	 System.out.println(Student.serialNum);
	 System.out.println(studentLizi.studentName + " StudentNumber : " + studentLizi.studentID);
 }
}
