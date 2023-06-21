package org.alan.java.staticex;

public class StudentTest3 {
	
	public static void main(String[] args) {
	 Student studentHeo = new Student();
	 studentHeo.setStudentName("Sunny Heo");
	 System.out.println(Student1.serialNum);
	 System.out.println(studentHeo.studentName + " StudentNumber : " + studentHeo.studentID);
	 
	 Student studentLizi = new Student();
	 studentLizi.setStudentName("lily Lizi");
	 System.out.println(Student1.serialNum); // italic for static variable
	 System.out.println(studentLizi.studentName + " StudentNumber : " + studentLizi.studentID);
 }
}
