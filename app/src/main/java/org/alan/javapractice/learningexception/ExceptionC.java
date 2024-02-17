package org.alan.javapractice.learningexception;

public class ExceptionC extends RuntimeException{

    public ExceptionC(String message) {
        super(message);
    }

    public ExceptionC(String message, Throwable cause) {
        super(message, cause);
    }

}
