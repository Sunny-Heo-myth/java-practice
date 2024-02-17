package org.alan.javapractice.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // direct default constructor create
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight) {
		name = pname;
		height = pheight;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
} // method overloaded = constructor overloaded
