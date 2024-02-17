package org.alan.javapractice.test;

import org.alan.javapractice.gamelevel.Player;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		//AdvancedLevel LevelB = new AdvancedLevel();
		//player.upgradeLevel(LevelB);
		player.play(2);
		
		//SuperLevel LevelC = new SuperLevel();
		//player.upgradeLevel(LevelC);
		player.play(3);
	}
}
