package org.alan.java.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Java";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1,  s2);
	}

}
