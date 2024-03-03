package org.alan.javapractice.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamCollectorTest {

    @Test
    @DisplayName("Find_All_Even_Numbers")
    void Find_All_Even_Numbers() {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evens = integers.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("Test1: " + evens);
    }

    @Test
    @DisplayName("Convert_Strings_to_Uppercase")
    void Convert_Strings_to_Uppercase() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise");
        List<String> uppercased = words.stream().map(String::toUpperCase).toList();
        System.out.println("Test2: " + uppercased);
    }

    @Test
    @DisplayName("Filter_Strings_by_Length")
    void Filter_Strings_by_Length() {
        List<String> words = Arrays.asList("Java", "Stream", "is", "cool");
        List<String> greaterThan3 = words.stream().filter(s -> s.length() > 3).toList();
        System.out.println("Test3: " + greaterThan3);
    }

    @Test
    @DisplayName("Find_Maximum_Value")
    void Find_Maximum_Value() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 91, 10);
        int max = numbers.stream().max(Comparator.comparingInt(i -> i)).orElse(-1);
        System.out.println("Test4: " + max);
    }

    @Test
    @DisplayName("Sum_of_List_Elements")
    void Sum_of_List_Elements() {
        List<Integer> numbers = Arrays.asList(5, 7, 8, 2, 3);
        long sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Test5: " + sum);
    }

    @Test
    @DisplayName("Sort_a_List_of_Strings")
    void Sort_a_List_of_Strings() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise");
        List<String> sortedWords = words.stream().sorted().toList();
        System.out.println("Test6: " + sortedWords);
    }

    @Test
    @DisplayName("Find_First_Element")
    void Find_First_Element() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise");
        String firstLongerThan3 = words.stream().filter(w -> w.length() > 3).findFirst().orElse(null);
        System.out.println("Test7: " + firstLongerThan3);
    }

    @Test
    @DisplayName("Count_Elements_Matching_a_Condition")
    void Count_Elements_Matching_a_Condition() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise", "Jupiter");
        long count = words.stream().filter(w -> w.startsWith("J")).count();
        System.out.println("Test8: " + count);
    }

    @Test
    @DisplayName("Convert_List_Elements_to_a_Map")
    void Convert_List_Elements_to_a_Map() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        Map<String, Integer> wordLengthMap = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("Test9: " + wordLengthMap);
    }

    @Test
    @DisplayName("FlatMap_Operation_to_Process_Nested_Lists")
    void FlatMap_Operation_to_Process_Nested_Lists() {
        List<List<Integer>> numberLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> integers = numberLists.stream().flatMap(Collection::stream).toList();
        System.out.println("Test10: " + integers);
    }

    @Test
    @DisplayName("Find Any Element That Matches Condition")
    void Find_Any_Element_That_Matches_Condition() {
        List<String> words = Arrays.asList("JavaStreamAPI", "Java", "APIExercise");
        List<String> endsWithApi = words.stream().filter(w -> w.endsWith("API")).toList();
        System.out.println("Test11: " + endsWithApi);
    }

    @Test
    @DisplayName("Check if Any String Matches a Condition")
    void Check_if_Any_String_Matches_a_Condition() {
        List<String> words = Arrays.asList("Java", "", "Stream", "API");
        List<String> emptyWords = words.stream().filter(String::isEmpty).toList();
        System.out.println("Test12: " + emptyWords);
    }

    @Test
    @DisplayName("Check if All Elements Match a Condition")
    void Check_if_All_Elements_Match_a_Condition() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, -7, 9);
        boolean isAllPositive = numbers.stream().allMatch(i -> i > 0);
        System.out.println("Test13: " + isAllPositive);
    }

    @Test
    @DisplayName("Create a List from Elements Repeatedly")
    void Create_a_List_from_Elements_Repeatedly() {
        int number = 5;
        List<Integer> integers = Stream.generate(() -> number).limit(10).toList();
        System.out.println("Test14: " + integers);
    }

    @Test
    @DisplayName("Grouping Elements")
    void Grouping_Elements() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise", "Code");
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Test15: " + groupedByLength);
    }

    @Test
    @DisplayName("Find Distinct Elements")
    void Find_Distinct_Elements() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println("Test16: " + distinctNumbers);
    }

    @Test
    @DisplayName("Custom Comparator for Sorting")
    void Custom_Comparator_for_Sorting() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Exercise");
        var sortedList = words.stream().sorted((w1, w2) -> -w1.compareTo(w2)).toList();
        System.out.println("Test17: " + sortedList);
    }

    @Test
    @DisplayName("Reduce Operation to Find Product")
    void Reduce_Operation_to_Find_Product() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long product = numbers.stream().reduce((i1, i2) -> i1 * i2).orElse(0);
        System.out.println("Test18: " + product);
    }

    @Test
    @DisplayName("Matching a Set of Strings Against a Condition")
    void Matching_a_Set_of_Strings_Against_a_Condition() {
        List<String> phrases = Arrays.asList("Java 8", "Java Stream API", "Java Exercise");
        boolean allContentJava = phrases.stream().allMatch(w -> w.contains("Java"));
        System.out.println("Test19: " + allContentJava);
    }

    @Test
    @DisplayName("Convert Elements to String and Concatenate")
    void Convert_Elements_to_String_and_Concatenate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String concatenated = numbers.stream().map(String::valueOf).reduce(String::concat).orElse(null);
        System.out.println("Test20: " + concatenated);
    }

    @Test
    @DisplayName("Word_Length_Map")
    void Word_Length_Map() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        Map<Character, List<String>> wordLengthMap = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Test21: " + wordLengthMap);
    }

}
