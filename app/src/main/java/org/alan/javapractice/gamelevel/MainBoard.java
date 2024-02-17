package org.alan.javapractice.gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel LevelA = new AdvancedLevel();
		player.upgradeLevel(LevelA);
		player.play(2);
		
		SuperLevel LevelB = new SuperLevel();
		player.upgradeLevel(LevelB);
		player.play(3);

	}

}
