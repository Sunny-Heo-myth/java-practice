package org.alan.javapractice.exception;

public class AutoCloseObjTest {
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Exception.");
		}
		
	}
}
