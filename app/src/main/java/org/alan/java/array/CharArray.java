package org.alan.java.array;

public class CharArray {
	public static void main(String[] args) {
		
		char[] alpha = new char[26];
		char abc = 'A';
		
		for(int i = 0; i < alpha.length; i++, abc++) {
			alpha[i] = abc;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + "," + (int)alpha[i]);
		}
		
	}
}
