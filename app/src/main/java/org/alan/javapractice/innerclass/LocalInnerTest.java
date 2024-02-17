package org.alan.javapractice.innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				// num = 200;        //Local variable turn into constant.
				// i = 100;        //Also the parameter.
				System.out.println("parameter : " + i);
				System.out.println("local : " + num);
				System.out.println("local inner member : " + localNum);
				System.out.println("member : " + outNum);
				System.out.println("static member : " + Outer.sNum);    //Outer.sNum : 
			}
			
		}
		return new MyRunnable();
	}
	
}

public class LocalInnerTest {
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
