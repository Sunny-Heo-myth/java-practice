package org.alan.java.learningexception;

public class ExceptionMain1 {

    public static void main(String[] args) {
        System.out.println("main called.");
        ExceptionMain1 exceptionMain1 = new ExceptionMain1();
        try {
            exceptionMain1.methodA();
        } catch (ExceptionA e) {
            System.out.println("ExceptionA caught.");
        } finally {
            System.out.println("main end.");
        }


    }

    private void methodA() {
        try {
            System.out.println("methodA called.");
            methodB();
            System.out.println("methodA end.");
        } catch (ExceptionB e) {
            System.out.println("ExceptionB caught.");
            throw new ExceptionA("ExceptionA is thrown by methodA!", e);
        } finally {
            System.out.println("methodA end.");
        }
    }

    private void methodB() {
        try {
            System.out.println("methodB called.");
            methodC();
        } catch (ExceptionC c) {
            System.out.println("ExceptionC caught.");
            String b = "ExceptionB is thrown by methodB!";
            throw new ExceptionB(b);
        } finally {
            System.out.println("methodB end.");
        }
    }

    private void methodC() throws ExceptionC {
        System.out.println("methodC called.");
        String c = "ExceptionC is thrown by methodC!";
        throw new ExceptionC(c);
    }
}
