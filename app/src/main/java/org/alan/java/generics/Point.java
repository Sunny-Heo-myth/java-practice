package org.alan.java.generics;

public class Point<X, Y> {
	X x;
	Y y;
	
	Point(X x, Y y){
		this.x = x;
		this.y = y;
	}
	
	public X getX() {
		return x;
	}
	
	public Y getY() {
		return y;
	}
}
