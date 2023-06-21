package org.alan.java.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Kim");
		treeSet.add("Lee");
		treeSet.add("Han");
		
		for(String str : treeSet) {                //for(dtype i : iterable)
			System.out.println(str);
		}

	}

}
