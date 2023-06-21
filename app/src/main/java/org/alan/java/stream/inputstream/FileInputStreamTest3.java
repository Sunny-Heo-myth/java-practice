package org.alan.java.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
			//	for(byte b : bs) {
			//		System.out.print((char)b);
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + " byte read");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
