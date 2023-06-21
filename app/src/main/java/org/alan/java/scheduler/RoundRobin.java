package org.alan.java.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Orderly collect.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Send to next collector.");

	}

}
