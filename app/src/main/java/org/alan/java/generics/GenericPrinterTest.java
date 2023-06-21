package org.alan.java.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();    // Create class with powder
		powderPrinter.setMaterial(new Powder());    // directly create powder instance
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();    // Create class with powder
		plasticPrinter.setMaterial(new Plastic());    // directly create powder instance
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		

	}

}
