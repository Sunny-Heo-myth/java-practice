package org.alan.javapractice.stream.stream;

import java.util.Arrays;

public class MatchExample {

    public static void main(String[] args) {
        int[] ints = {0,1,2,3,4,5,6,7,8,9};
        int[] anotherInts = new int[10];

        boolean aBoolean = Arrays.stream(ints)
            .allMatch(a -> a%2 == 0);
        System.out.println(aBoolean);

        aBoolean = Arrays.stream(ints)
            .anyMatch(a -> a%2 == 0);
        System.out.println(aBoolean);

        aBoolean = Arrays.stream(ints)
            .noneMatch(a -> a/10 == 1);
        System.out.println(aBoolean);

    }
}
