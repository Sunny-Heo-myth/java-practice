package org.alan.javapractice.template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Goes manual.");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop driving.");
		
	}

	@Override
	public void vision() {
		System.out.println("Wipe the window.");
		
	}

}
