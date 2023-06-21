package org.alan.java.innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("Inner class instance variable : " + inNum);
			System.out.println("Inner class static variable : " + sInNum);
			System.out.println("Outer class static variable : " + sNum);
		}
		
		static void sTest(){
			// num += 10;
			// inNum += 10;
			System.out.println("Inner class static variable : " + sInNum);
			System.out.println("Outer class static variable : " + sNum);
		}
		
	}

}

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		// call ...InStaticClass as inTest
		sInClass.inTest();
		sInClass.sTest();
	}

}
