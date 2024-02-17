package org.alan.javapractice.stream.stream;

import java.util.Arrays;

public class FilteringExample {

    public static void main(String[] args) {
        String[] array = {"hong",
            "dong",
            "song",
            "kong",
            "kong",
            "cone"};

        Arrays.stream(array)
            .distinct()
            .forEach(System.out::println);

        System.out.println();

        Arrays.stream(array)
            .filter(s -> s.endsWith("g"))
            .forEach(System.out::println);

        System.out.println();

        Arrays.stream(array)
            .distinct()
            .filter(s -> s.endsWith("g"))
            .forEach(System.out::println);
    }
}
