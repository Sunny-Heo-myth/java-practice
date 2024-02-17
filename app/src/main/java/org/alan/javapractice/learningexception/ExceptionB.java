package org.alan.javapractice.learningexception;

public class ExceptionB extends RuntimeException {

    public ExceptionB(String message) {
        super(message);
    }

    public ExceptionB(String message, Throwable cause) {
        super(message, cause);
    }

}
