package org.alan.java.array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] intarray = new int[] {0,1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for(int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}
		
		for(int i = 0; i < intarray.length; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
