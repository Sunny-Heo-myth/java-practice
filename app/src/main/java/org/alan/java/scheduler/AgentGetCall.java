package org.alan.java.scheduler;

public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Request call by Collector.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Collector took call.");

	}

}
