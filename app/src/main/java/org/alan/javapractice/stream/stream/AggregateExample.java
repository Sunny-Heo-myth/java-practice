package org.alan.javapractice.stream.stream;

import java.util.Arrays;

public class AggregateExample {

    public static void main(String[] args) {
        int[] ints = {0,1,2,3,4,5,6,7,8,9};
        int[] anotherInts = new int[10];

        long count = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .count();
        System.out.println(count);

        int sum = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .sum();
        System.out.println(sum);

        int first = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .findFirst()
            .getAsInt();
        System.out.println(first);

    }
}
