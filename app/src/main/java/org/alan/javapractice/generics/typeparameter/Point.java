package org.alan.javapractice.generics.typeparameter;

public class Point<X, Y> {
	X x;
	Y y;
	
	public Point(X x, Y y){
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
