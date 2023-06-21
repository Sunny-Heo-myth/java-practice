package org.alan.java.array;

public class ObjectCopy1 {
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("�˷��ý� �����ٽ��� ��� ����", " ���ڽ� ī����Ű��");
		bookArray1[1] = new Book("����", "����");
		bookArray1[2] = new Book("������ ����", "��ó�� ���θ�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}
}
