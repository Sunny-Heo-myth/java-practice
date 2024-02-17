package org.alan.javapractice.gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void chat() {
		System.out.println("I want my money!");
		
	}

	@Override
	public void crawl() {
		System.out.println("Crawling.");
		
	}

	@Override
	public void walk() {
		System.out.println("Not capable of walk.");
		
	}

	@Override
	public void showLM() {
		System.out.println("======== Toddler ========");
		
	}

}
