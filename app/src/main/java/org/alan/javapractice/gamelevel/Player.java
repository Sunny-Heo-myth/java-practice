package org.alan.javapractice.gamelevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLM();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLM();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
