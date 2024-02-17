package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.function.IntPredicate;

public class PredicateCompositionExample {

    public static void main(String[] args) {
        IntPredicate predicateA = a -> a%2 == 0;
        IntPredicate predicateB = a -> a%3 == 0;
        IntPredicate predicateC;
        IntPredicate predicateD;
        IntPredicate predicateE;

        predicateC = predicateA.and(predicateB);
        System.out.println(predicateC.test(9));

        predicateD = predicateA.or(predicateB);
        System.out.println(predicateD.test(9));

        predicateE = predicateA.negate();
        System.out.println(predicateE.test(9));
    }
}
