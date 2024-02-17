package org.alan.javapractice.template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("Autopilot.");
		
	}

	@Override
	public void stop() {
		System.out.println("Cease Autopilot.");
		
	}

	@Override
	public void vision() {
		System.out.println("Initiate vision control.");
		
	}
	
}
