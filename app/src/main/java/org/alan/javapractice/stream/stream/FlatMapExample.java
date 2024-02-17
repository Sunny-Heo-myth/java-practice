package org.alan.javapractice.stream.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hong dome",
            "dong kome",
            "song come",
            "kong pome",
            "kong fome",
            "cone qome");

        list.stream()
            .flatMap(s -> Arrays.stream(s.split("")))
            .forEach(System.out::println);

        System.out.println();

        List<String> sList = Arrays.asList("10, 20, 30", "40, 50, 60");
        sList.stream()
            .flatMapToInt(s -> {
                String[] strings = s.split(",");
                int[] intArray = new int[strings.length];
                for (int i = 0; i < intArray.length; i++) intArray[i] = Integer.parseInt(strings[i].trim());
                return Arrays.stream(intArray);
            })
            .forEach(System.out::println);
    }
}
