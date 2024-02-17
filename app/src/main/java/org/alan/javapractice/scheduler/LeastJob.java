package org.alan.javapractice.scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Next call.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Send to empty collector.");

	}

}
