package org.alan.javapractice.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void vision();
	
	public void startCar() {
		System.out.println("Start.");
	}
	
	public void turnOff() {
		System.out.println("Turn off.");
	}
	
	final public void run() {
		startCar();
		drive();
		vision();
		stop();
		turnOff();
	}
}
