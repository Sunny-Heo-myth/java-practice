package org.alan.java.template;

public class Cartest {

	public static void main(String[] args) {
		System.out.println("======== Next ========");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("======== Now ========");
		Car herCar = new ManualCar();
		herCar.run();
	}

}
