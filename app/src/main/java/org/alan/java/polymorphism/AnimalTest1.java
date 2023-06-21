package org.alan.java.polymorphism;
	
class Animal{
	public void move() {
		System.out.println("Animal move.");
	}
}
	
class Chimp extends Animal{
	public void move() {
		System.out.println("Chimp walk.");
	}	
}

class Tiger extends Animal{
	public void move(){
		System.out.println("Tiger run.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle fly.");
	}
}

public class AnimalTest1 {	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Chimp());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
