package org.alan.java.stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("hong", 10),
            new Student("dong  ", 20),
            new Student("song", 30)
        );

        Stream<Student> stream = students.stream();
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
