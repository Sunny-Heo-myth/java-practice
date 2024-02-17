package org.alan.javapractice.cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	long money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(long money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Subway " + lineNumber + "'s passenger is "
				+ passengerCount + ". and total sale is " + money + ".");
	}
}
