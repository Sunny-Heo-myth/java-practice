package org.alan.java.learningexception;

public class ExceptionC extends RuntimeException{

    public ExceptionC(String message) {
        super(message);
    }

    public ExceptionC(String message, Throwable cause) {
        super(message, cause);
    }

}
