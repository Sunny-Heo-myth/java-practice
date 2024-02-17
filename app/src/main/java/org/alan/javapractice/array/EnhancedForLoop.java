package org.alan.javapractice.array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		String[] strarray = {"Java", "Android", "C", "JavaScript", "Python"};
		int[] intArray = {1,2,3,4,5,6,7,8,9,0};
		
		for(String element : strarray) {
			System.out.println(element);
		}
		
		for(int element : intArray) {
			System.out.println(element);
		}
		
	}
}
