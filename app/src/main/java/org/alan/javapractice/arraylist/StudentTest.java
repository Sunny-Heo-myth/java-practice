
package org.alan.javapractice.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentHeo = new Student(1001, "Heo");
		studentHeo.addSubject("Korean", 100);
		studentHeo.addSubject("Mathematics", 100);
		
		Student studentSunny = new Student(1001, "Sunny");
		studentSunny.addSubject("Korean", 100);
		studentSunny.addSubject("Mathematics", 100);
		studentSunny.addSubject("English", 100);

		studentHeo.showStudentInfo();
		System.out.println("=====================================");
		studentSunny.showStudentInfo();
	}

}
