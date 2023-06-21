package org.alan.java.scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Orderly collect by customer rank.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Send to good collector.");

	}

}
