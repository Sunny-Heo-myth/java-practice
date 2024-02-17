package org.alan.javapractice.stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("name : ");
		String name = scanner.nextLine();
		System.out.println("career : ");
		String career = scanner.nextLine();
		System.out.println("number : ");
		int number = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(career);
		System.out.println(number);
		
		scanner.close();
	}

}
