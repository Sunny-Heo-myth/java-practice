package org.alan.java.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("WIN_20190913_07_53_07_Pro.mp4");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			millisecond = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
				}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}
		catch(IOException e) {
			e.printStackTrace();
			}
		
		System.out.println("Took " + millisecond + ".");
	}
}
