package org.alan.java.exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Resource has been closed.");
	}

}
