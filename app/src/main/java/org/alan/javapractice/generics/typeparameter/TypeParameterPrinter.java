package org.alan.javapractice.generics.typeparameter;

import org.alan.javapractice.generics.Material;

public class TypeParameterPrinter<X extends Material> {
	private X material;
	
	public void setMaterial(X material) {
		this.material = material;
	}
	
	public X getMaterial() {
		return material;
	}
	
	public String toString() {
		System.out.println("TypeParameterPrinter method");
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
