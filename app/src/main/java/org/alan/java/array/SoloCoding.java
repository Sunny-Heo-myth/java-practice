package org.alan.java.array;

public class SoloCoding {
	public static void main(String[] args) {
		
		char[][] dimensions = new char[13][2];
		char character = 'A';
		
		for(int i = 0; i < dimensions.length; i++) {
			for(int j = 0; j < dimensions[i].length; j++, character++) {
				dimensions[i][j] = character;
			}
		}
						
		for(int i = 0; i < dimensions.length; i++) {
				System.out.println(dimensions[i]);
		}
		
	}
}
