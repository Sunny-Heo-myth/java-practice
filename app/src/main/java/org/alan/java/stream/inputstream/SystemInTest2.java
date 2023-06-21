package org.alan.java.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("Type alphabets and press Enter.");
		
		int i;
		
		try {
			while((i = System.in.read()) != -1) {
				System.out.println((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
