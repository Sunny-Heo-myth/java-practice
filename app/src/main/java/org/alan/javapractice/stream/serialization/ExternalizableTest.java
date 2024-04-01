package org.alan.javapractice.stream.serialization;

import java.io.*;

class Dog implements Externalizable{
	
	String name;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
	public String toString() {
		return name;
	}
	
}

public class ExternalizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog myDog = new Dog();
		myDog.name = "Sunny";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(myDog);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
	
	}
}
