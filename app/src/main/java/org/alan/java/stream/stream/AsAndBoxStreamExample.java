package org.alan.java.stream.stream;

import java.util.Arrays;

public class AsAndBoxStreamExample {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        Arrays.stream(intArray)
            .asDoubleStream()
            .forEach(System.out::println);

        System.out.println();

        Arrays.stream(intArray)
            .boxed()
            .forEach(obj -> System.out.println(obj.intValue()));
    }
}
