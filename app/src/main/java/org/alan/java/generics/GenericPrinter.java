package org.alan.java.generics;

public class GenericPrinter<X extends Material> {
	private X material;
	
	public void setMaterial(X material) {
		this.material = material;
	}
	
	public X getMaterial() {
		return material;
	}
	
	public String toString() {
		System.out.println("GenericPrinter method");
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
