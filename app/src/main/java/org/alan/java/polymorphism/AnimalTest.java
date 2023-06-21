package org.alan.java.polymorphism;
import java.util.ArrayList;

class Human {
	public void dooo() {
		System.out.println("Human do.");
	}
}

class Sunny extends Human {
	public void dooo() {
		System.out.println("Sunny play.");
	}
	
	public void love() {
		System.out.println("Sunny loves.");
	}
}	

class Jenny extends Human {
	public void dooo() {
		System.out.println("Jenny translate.");
	}
	
	public void wander() {
		System.out.println("Jenny wanders.");
	}
}

class Lizi extends Human {
	public void dooo() {
		System.out.println("Lizi study.");
	}
	
	public void dance() {
		System.out.println("Lizi dance.");
	}
}
	
public class AnimalTest {
	ArrayList<Human> aniList = new ArrayList<Human>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("Downcast to original type.");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Sunny());
		aniList.add(new Jenny());
		aniList.add(new Lizi());
		
		for(Human ani : aniList) {
			ani.dooo();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Human ani = aniList.get(i);
			if(ani instanceof Sunny) {
				Sunny x = (Sunny)ani;
				x.love();	
			}
			else if(ani instanceof Jenny) {
				Jenny x = (Jenny)ani;
				x.wander();
			}
			else if(ani instanceof Lizi) {
				Lizi x = (Lizi)ani;
				x.dance();
			}
			else{
				System.out.println("I do not know what are they doing.");
			}
		}
	}
}
