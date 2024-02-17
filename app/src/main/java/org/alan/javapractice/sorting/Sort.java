package org.alan.javapractice.sorting;

public interface Sort {
	int[] ascending(int[] arr);
	int[] descending(int[] arr);
	
	public default void description() {
		System.out.println("Sorting algorithm.");
	}
}
