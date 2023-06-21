package org.alan.java.stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("name : ");
		String name = console.readLine();
		
		System.out.println("career : ");
		String career = console.readLine();
		
		System.out.println("password : ");
		char[] password = console.readPassword();
		
		String strPass = new String(password);
		
		System.out.println(name);
		System.out.println(career);
		System.out.println(strPass);

	}

}
