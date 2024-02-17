package org.alan.javapractice.exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Resource has been closed.");
	}

}
