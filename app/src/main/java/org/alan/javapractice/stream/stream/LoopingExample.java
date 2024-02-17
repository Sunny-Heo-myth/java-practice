package org.alan.javapractice.stream.stream;

import java.util.Arrays;

public class LoopingExample {

    public static void main(String[] args) {
        int[] ints = {0,1,2,3,4,5,6,7,8,9};
        int[] anotherInts = new int[10];

        int sum =Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .peek(System.out::println)
            .sum();

        System.out.println(sum);


    }

}
