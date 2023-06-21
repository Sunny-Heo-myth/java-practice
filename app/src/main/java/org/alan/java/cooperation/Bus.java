package org.alan.java.cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	long money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(long money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Bus " + busNumber + "'s passenger is "
			+ passengerCount + ". and total sale is " + money + ".");
	}
}
