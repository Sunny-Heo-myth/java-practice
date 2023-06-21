package org.alan.java.stream.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("hong", 10),
            new Student("dong  ", 20),
            new Student("song", 30)
            );

        double avg = students.stream()
            .mapToInt(Student::getScore)
            .average()
            .getAsDouble();

        System.out.println(avg);
    }
}

