package org.alan.javapractice.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
			return;                // why return?
		}
		finally {
			
			if(fis != null) {
				try {
					fis.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("'Finally' sequence executed.");
		}
		
		System.out.println("End of program.");    // Why does not executed?

	}
}
