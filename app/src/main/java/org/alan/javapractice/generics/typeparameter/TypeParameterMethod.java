package org.alan.javapractice.generics.typeparameter;

public class TypeParameterMethod {

	public static <X, Y> double makeRec(Point<X, Y> p1, Point<X, Y> p2) {
		double left = ((Number)p1.getX()).doubleValue();    
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		// downcast to Number and do method doubleValue
		
		double width = right - left;
		double height = bottom - top;
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		// not clarified in method but clarified in declaration
		
		double rect1 = TypeParameterMethod.<Integer, Double>makeRec(p1, p2);
		double rect2 = TypeParameterMethod.makeRec(p1, p2);
		
		System.out.println(rect1);
		System.out.println(rect2);

	}

}
