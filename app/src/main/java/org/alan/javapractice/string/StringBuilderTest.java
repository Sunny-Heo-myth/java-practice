package org.alan.javapractice.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javastr = new String("Java");
		System.out.println(System.identityHashCode(javastr));
		
		StringBuilder buffer = new StringBuilder(javastr);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println(System.identityHashCode(buffer));
		
		javastr = buffer.toString();
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));
	}

}
