package org.alan.javapractice.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("Lim"));
		hashSet.add(new String("Heo"));
		hashSet.add(new String("Lee"));
		hashSet.add(new String("Kim"));
		hashSet.add(new String("Lim"));
		
		System.out.println(hashSet);

	}

}
