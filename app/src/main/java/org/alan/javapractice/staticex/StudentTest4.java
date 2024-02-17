package org.alan.javapractice.staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentHeo = new Student2();
		studentHeo.setStudentName("SunnyHeo");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentHeo.studentName + " StudentNumber : " + studentHeo.studentID);

		Student2 studentLizi = new Student2();
		studentLizi.setStudentName("LilyLizi");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLizi.studentName + " StudentNumber : " + studentLizi.studentID);
	}

}
