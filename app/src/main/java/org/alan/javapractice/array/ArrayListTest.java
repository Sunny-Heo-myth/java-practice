package org.alan.javapractice.array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("������ ����", "��ó�� ���θ�"));
		library.add(new Book("�̱��� ������", "��ó�� ��Ų��"));
		library.add(new Book("�����", "�������丮"));
		
		for(int i = 0; i < library.size(); i++) {
			Book element = library.get(i);
			element.showBookInfo();
			// Generic dtype automatically designated library arraylist as Book class array.
		}
		
		System.out.println();
		System.out.println("===Using EnhancedForLoop===");
		
		for (Book element : library) {
			element.showBookInfo();
		}
		
	}
}
