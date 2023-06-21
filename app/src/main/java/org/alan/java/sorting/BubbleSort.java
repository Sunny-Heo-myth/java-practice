package org.alan.java.sorting;

public class BubbleSort implements Sort {

	@Override
	public int[] ascending(int[] arr) {
		System.out.println("Ascending Bubble-Sorting algorithm.");
		return null;
	}

	@Override
	public int[] descending(int[] arr) {
		System.out.println("Descending Bubble-Sorting algorithm.");
		return null;
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Bubble-Sorting algorithm.");
	}

}
