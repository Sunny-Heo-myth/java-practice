package org.alan.java.stream.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {

    public static void main(String[] args) {
        String[] array = {"hong",
            "dong",
            "song"};

        Arrays.stream(array)
            .forEach(s -> System.out.println(s));

        System.out.println();

        Arrays.stream(new int[]{1, 2, 3, 4, 5})
            .forEach(i -> System.out.println(i));
    }
}
