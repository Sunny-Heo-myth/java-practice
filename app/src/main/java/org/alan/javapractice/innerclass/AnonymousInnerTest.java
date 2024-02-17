package org.alan.javapractice.innerclass;

class Outer2{
	
	Runnable getRunnable(int i) {                // METHOD
		int num = 100;
		
		return new Runnable() {    // method inner class start
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};	                // method inner class end
	}
	
	Runnable runner = new Runnable() {                // VARIABLE
		@Override
		public void run() {
			System.out.println("Runnable member variable");
		}
	};
	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		
		runnable.run();
		out.runner.run();

	}

}
