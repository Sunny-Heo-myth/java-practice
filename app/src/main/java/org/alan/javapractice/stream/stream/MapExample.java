package org.alan.javapractice.stream.stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {
        List<String> intList = Arrays.asList("10, 20, 30", "40, 50, 60");

        intList.stream()
            .flatMapToInt(s -> {
                String[] strings = s.split(",");
                int[] intArray = new int[strings.length];
                for (int i = 0; i < intArray.length; i++) intArray[i] = Integer.parseInt(strings[i].trim());
                return Arrays.stream(intArray);
            })
            .mapToDouble(i -> (double) i)
            .forEach(System.out::println);
    }
}
