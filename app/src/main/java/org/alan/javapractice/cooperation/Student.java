 package org.alan.javapractice.cooperation;

public class Student {
	public String studentName;
	public int grade;
	public long money;
	
	public Student(String studentName, long money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000); // cooperation with other class type
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500); // cooperation with other class type
		this.money -= 1500;
	}

	public void showInfo() {
		System.out.println(studentName + " left " + money +".");
	}

}
