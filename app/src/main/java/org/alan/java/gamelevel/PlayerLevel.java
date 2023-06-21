package org.alan.java.gamelevel;

public abstract class PlayerLevel {
	public abstract void chat();
	public abstract void crawl();
	public abstract void walk();
	public abstract void showLM();
	
	final public void go(int count) {
		chat();
		for(int i = 0; i < count; i++) {
			crawl();
		}
		walk();
	}
}
