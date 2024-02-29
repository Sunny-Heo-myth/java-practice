package org.alan.javapractice.generics;

import org.alan.javapractice.generics.typeparameter.TypeParameterPrinter;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		TypeParameterPrinter<Powder> powderPrinter = new TypeParameterPrinter<Powder>();    // Create class with powder
		powderPrinter.setMaterial(new Powder());    // directly create powder instance
		powderPrinter.printing();
		
		TypeParameterPrinter<Plastic> plasticPrinter = new TypeParameterPrinter<Plastic>();    // Create class with powder
		plasticPrinter.setMaterial(new Plastic());    // directly create powder instance
		plasticPrinter.printing();
	}

}
