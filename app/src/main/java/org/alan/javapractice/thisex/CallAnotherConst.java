package org.alan.javapractice.thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("Sunny", 28);  // Assign default member value for new class 
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // return reference data type 'Person'
		return this;
	}

}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}