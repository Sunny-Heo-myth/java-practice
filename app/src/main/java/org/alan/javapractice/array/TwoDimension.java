package org.alan.javapractice.array;

public class TwoDimension {
	public static void main(String[] args) {
		
		int[][] dimensions = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < dimensions.length; i++) {
			for(int j = 0; j < dimensions[i].length; j++) {
				System.out.println(dimensions[i][j]);
			}
		}
		
	}
}
