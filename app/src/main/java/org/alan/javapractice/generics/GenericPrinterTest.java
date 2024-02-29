package org.alan.javapractice.generics;

import org.alan.javapractice.generics.typeparameter.TypeParameterPrinter;

public class GenericPrinterTest {

	public static void main(String[] args) {
		TypeParameterPrinter<Powder> powderPrinter = new TypeParameterPrinter<Powder>();    // Create class with powder
		powderPrinter.setMaterial(new Powder());    // directly create powder instance
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		
		TypeParameterPrinter<Plastic> plasticPrinter = new TypeParameterPrinter<Plastic>();    // Create class with powder
		plasticPrinter.setMaterial(new Plastic());    // directly create powder instance
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		

	}

}
