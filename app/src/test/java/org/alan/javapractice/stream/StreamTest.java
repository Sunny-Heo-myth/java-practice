package org.alan.javapractice.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
    @Test
    public void test1() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Map<String, Integer> wordLengthMap = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(wordLengthMap);
    }

    @Test
    public void test2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        Map<Character, List<String>> wordLengthMap = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.mapping(Function.identity(), Collectors.toList())));
        System.out.println(wordLengthMap);
    }
}
