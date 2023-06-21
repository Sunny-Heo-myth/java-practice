package org.alan.java.abstractex;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("Trun on.");
	}
	
	public void turnOff() {
		System.out.println("Turn off.");
	}
	
}
