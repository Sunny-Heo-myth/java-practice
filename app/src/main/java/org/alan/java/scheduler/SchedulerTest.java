package org.alan.java.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("Choose.");
		System.out.println("R");
		System.out.println("L");
		System.out.println("P");
		System.out.println("A");
		
		int ch = System.in.read();
		Scheduler scheduler = null; //Empty member variable declared as empty value.
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		
		else {
			System.out.println("Unavailable Function");
			return;                // RETURN??????????????????
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
