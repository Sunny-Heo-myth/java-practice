package org.alan.javapractice.interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("int cal implement.");
		myMethod();
	}
	
	static int total(int[] arr) {        //arr is input list class for method total
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
		
		private void myMethod() {
			System.out.println("Private method.");
		}
		
		private static void myStaticMethod() {
			System.out.println("private static method.");
		}
	
}

// Overriding in Java simply means that the particular method would be called based on 
// the run time type of the object and not on the compile time type of it.
// Compile means produce (something, especially a list, report, or book) by assembling information 
// collected from other sources??????????????????????