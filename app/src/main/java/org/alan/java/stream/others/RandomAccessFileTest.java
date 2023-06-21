package org.alan.java.stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		
		raf.writeInt(100);
		System.out.println("file pointer location" + raf.getFilePointer());
		raf.writeDouble(3.141592653589793);
		System.out.println("file pointer location" + raf.getFilePointer());
		raf.writeUTF("Hello.");
		System.out.println("file pointer location" + raf.getFilePointer());
		
		raf.seek(0);
		System.out.println("file pointer location" + raf.getFilePointer());
		
		int i = raf.readInt();
		double d = raf.readDouble();
		String str = raf.readUTF();
		
		System.out.println("file pointer location" + raf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}
}
