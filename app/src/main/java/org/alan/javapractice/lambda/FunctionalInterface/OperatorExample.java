package org.alan.javapractice.lambda.FunctionalInterface;


import java.util.function.IntBinaryOperator;


public class OperatorExample {

    private static final int[] ints = {1,2,3,4,5,6,7,8,9,0};

    private static int maxOrMin(IntBinaryOperator operator) {
        int result = ints[0];
        for (int i : ints) result = operator.applyAsInt(result, i);
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
            (a, b) -> {
                if (a >= b) return a;
                else return b;
            }
        );
        System.out.println(max);

        int min = maxOrMin(
            (a, b) -> {
                if(a <= b) return a;
                else return b;
            }
        );
        System.out.println(min);
    }
}
