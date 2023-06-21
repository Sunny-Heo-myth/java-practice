package org.alan.java.generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();    // Create class with powder
		powderPrinter.setMaterial(new Powder());    // directly create powder instance
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();    // Create class with powder
		plasticPrinter.setMaterial(new Plastic());    // directly create powder instance
		plasticPrinter.printing();
	}

}
