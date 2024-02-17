package org.alan.javapractice.stream.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("hong", Member.MALE, 30),
            new Member("kong", Member.MALE, 40),
            new Member("song", Member.FEMALE, 18),
            new Member("dong", Member.FEMALE, 18),
            new Member("bong", Member.MALE, 70)
        );

        int sum = members.stream()
            .mapToInt(Member::getAge)
            .sum();

        int sum2 = members.stream()
            .map(Member::getAge)
            .reduce((a, b) -> a + b)
            .get();

        int sum21 = members.stream()
            .map(Member::getAge)
            .reduce(Integer::sum)
            .get();

        int sum3 = members.stream()
            .map(Member::getAge)
            .reduce(0, (a, b) -> a + b);

        System.out.println(sum + "\n" + sum2 + "\n" + sum3);
    }
}
