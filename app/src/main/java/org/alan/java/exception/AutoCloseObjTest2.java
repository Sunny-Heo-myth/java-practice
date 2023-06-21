package org.alan.java.exception;

public class AutoCloseObjTest2 {
	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Exception.");
		}

	}
}
