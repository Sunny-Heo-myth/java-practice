package org.alan.java.exception;

public class AutoCloseTest {
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
		}
		catch(Exception e) {
			System.out.println("Exception.");
		}

	}
}
