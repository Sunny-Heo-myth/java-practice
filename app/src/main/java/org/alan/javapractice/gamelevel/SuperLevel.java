package org.alan.javapractice.gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void chat() {
		System.out.println("I like you.");
		
	}

	@Override
	public void crawl() {
		System.out.println("Fast crawling.");
		
	}

	@Override
	public void walk() {
		System.out.println("Walking.");
		
	}

	@Override
	public void showLM() {
		System.out.println("======== Child ========");
		
	}

}
