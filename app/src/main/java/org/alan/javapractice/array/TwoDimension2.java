package org.alan.javapractice.array;

public class TwoDimension2 {
	public static void main(String[] args) {
		
		int[][] intarray = new int[2][3];
		
		for(int i = 0; i < intarray.length; i++) {
			for(int j = 0; j < intarray[i].length; j++) {
				System.out.println(intarray[i][j]);
			}
			System.out.println(); // Give an empty line.
		}
		System.out.println(intarray.length);
		System.out.println(intarray[0].length);
		
	}
}
