package org.alan.javapractice.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

    @DisplayName("Expected output: {apple=5, banana=6, cherry=6, date=4}")
    @Test
    public void test1() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(words.stream().collect(Collectors.toMap(s -> s, String::length)));
    }

    @DisplayName("Expected output: {A=[Alice, Anna], B=[Bob], C=[Charlie]}")
    @Test
    public void test2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        System.out.println(names.stream().collect(Collectors.groupingBy(s -> s.charAt(0))));
    }

    @DisplayName("Expected output: {Fruit=1.95, Vegetable=0.50}")
    @Test
    public void test3() {
        List<Product> products = Arrays.asList(
                new Product("Apple", "Fruit", 1.20),
                new Product("Banana", "Fruit", 0.75),
                new Product("Tomato", "Vegetable", 0.50)
        );
        System.out.println(products.stream().collect(Collectors.groupingBy(Product::kind, Collectors.summingDouble(Product::cost))));
    }

    private record Product(String name, String kind, double cost) {
    }
}
