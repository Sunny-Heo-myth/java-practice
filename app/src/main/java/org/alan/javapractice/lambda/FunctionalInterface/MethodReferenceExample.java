package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = Calculator::staticAdd;
        System.out.println(operator.applyAsInt(1, 2));

        Calculator cal = new Calculator();
        operator = cal::instanceAdd;
        System.out.println(operator.applyAsInt(1, 2));
    }

}
