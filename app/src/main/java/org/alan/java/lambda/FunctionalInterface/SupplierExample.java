package org.alan.java.lambda.FunctionalInterface;

import java.util.function.IntSupplier;

public class SupplierExample {

    public static void main(String[] args) {
        IntSupplier intsupplier = () -> {
            int num = (int) (6*Math.random() + 1);
            return num;
        };

        int num = intsupplier.getAsInt();
        System.out.println(num);
    }
    static int method(int x, int y) {
        IntSupplier supplier = () -> {
            //x *= 10;
            //return x + y;
            return 0;
        };
        return supplier.getAsInt();
    }
}
