package org.alan.javapractice.classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException{
		
		Person person1 = new Person();
		
		System.out.println(person1);
		
		Class<?> pClass = Class.forName("org.alan.javapractice.classex.Person");
		
		Person person2 = (Person) pClass.newInstance();
		
		System.out.println(person2);

	}
}
