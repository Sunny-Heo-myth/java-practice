package org.alan.javapractice.stream.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5,3,4,1,2});
        intStream
            .sorted()
            .forEach(System.out::println);

        System.out.println();

        List<Student> studentList = Arrays.asList(
            new Student("Song", 33),
            new Student("Oong", 31),
            new Student("Fong", 34)
        );

        studentList.stream()
            .sorted()
            .forEach(student -> System.out.println(student.name));

        System.out.println();

        studentList.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(student -> System.out.println(student.name));
    }
}
