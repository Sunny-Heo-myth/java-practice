package org.alan.java.stream.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�.");
			fw.write(buf, 1, 2);
			fw.write("65");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end.");

	}

}
