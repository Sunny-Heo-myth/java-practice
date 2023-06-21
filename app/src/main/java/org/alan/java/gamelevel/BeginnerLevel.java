package org.alan.java.gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void chat() {
		System.out.println("Mama, Papa.");
		
	}

	@Override
	public void crawl() {
		System.out.println("Not capable of crawl.");
		
	}

	@Override
	public void walk() {
		System.out.println("Not capable of walk.");
		
	}

	@Override
	public void showLM() {
		System.out.println("======== Infant ========");
		
	}

}
