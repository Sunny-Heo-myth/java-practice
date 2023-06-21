package org.alan.java.stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("hong", 74, Student.Sex.MALE, Student.City.SEOUL),
            new Student("kong", 84, Student.Sex.FEMALE, Student.City.BUSAN),
            new Student("song", 92, Student.Sex.FEMALE, Student.City.SEOUL),
            new Student("dong", 52, Student.Sex.MALE, Student.City.SEOUL),
            new Student("bong", 81, Student.Sex.MALE, Student.City.BUSAN)
        );

        Map<Student.Sex, List<Student>> mapBySex = students.stream()
            .collect(Collectors.groupingBy(
                Student::getSex));

        mapBySex.get(Student.Sex.MALE).stream()
            .forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        mapBySex.get(Student.Sex.FEMALE).stream()
            .forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.City, List<Student>> mapByCity2 = students.stream()
            .collect(Collectors.groupingBy(
                Student::getCity));
        mapByCity2.get(Student.City.SEOUL).forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.City, List<String>> mapByCity = students.stream()
            .collect(
                Collectors.groupingBy(
                Student::getCity,
                Collectors.mapping(Student::getName, Collectors.toList())
                )
            );
        mapByCity2.get(Student.City.BUSAN).forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.Sex, List<String>> mapBySex2 = students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSex,
                    Collectors.mapping(Student::getName, Collectors.toList())
                )
            );
        mapBySex2.get(Student.Sex.MALE).forEach(System.out::println);

        System.out.println("----------------------------------------");

        Map<Student.Sex, Double> avgBySex = students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSex,
                    Collectors.averagingDouble(Student::getScore)
                )
            );
        System.out.println(avgBySex.get(Student.Sex.FEMALE));
    }
}
