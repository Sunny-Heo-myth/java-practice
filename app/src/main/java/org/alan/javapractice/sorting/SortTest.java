package org.alan.javapractice.sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Choose sorting mechanism.");
		System.out.println("B : BubbleSort ");
		System.out.println("H : HeapSort ");
		System.out.println("Q : QuickSort ");

		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}

		else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		
		else {
			System.out.println("Unavailable function.");
			return;                //????????????????????
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
