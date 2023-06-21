package org.alan.java.string;

public class StringTest2 {

	public static void main(String[] args) {
		String javastr = new String("Java");
		String androidstr = new String("Android");
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));
		
		javastr = javastr.concat(androidstr);
		
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));
	}

}
