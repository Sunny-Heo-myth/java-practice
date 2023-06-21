package org.alan.java.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentSunny = new Student("Sunny", 1000000000);
		Student studentLily = new Student("Lily", 1000000000);

		Bus bus216 = new Bus(216);
		studentSunny.takeBus(bus216);
		studentSunny.showInfo();
		bus216.showInfo();
		
		Subway subway2 = new Subway("Line 2");
		studentLily.takeSubway(subway2);
		studentLily.showInfo();
		subway2.showInfo();
		 
	}

}
