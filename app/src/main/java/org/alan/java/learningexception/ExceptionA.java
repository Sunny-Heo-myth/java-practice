package org.alan.java.learningexception;

public class ExceptionA extends RuntimeException {

    public ExceptionA(String message) {
        super(message);
    }

    public ExceptionA(String message, Throwable cause) {
        super(message, cause);
    }

}
