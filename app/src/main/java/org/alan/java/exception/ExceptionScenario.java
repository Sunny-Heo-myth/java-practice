package org.alan.java.exception;

import org.alan.java.exception.domain.ExceptionA;
import org.alan.java.exception.domain.ExceptionD;

public class ExceptionScenario {

    public static void main(String[] args) {
        try {
            System.out.println("main try go.");
            methodA();
            System.out.println("main try end.");
        } catch (ExceptionA e) {
            System.out.println("main catch go.");
            System.out.println("main catch end.");
        } finally {
            System.out.println("main finally go.");
            System.out.println("main finally end.");
        }
    }

    private static void methodA() {
        System.out.println("methodA called.");
        System.out.println("methodA end.");
    }

    private static void methodB() {
        System.out.println("methodB called.");
        System.out.println("methodB end.");
    }

    private static void methodC() {
        System.out.println("methodC called.");
        System.out.println("methodC end.");
    }

    private static void methodD() {
        System.out.println("methodD called.");
        System.out.println("methodD end.");
    }
}
