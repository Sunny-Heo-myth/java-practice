package org.alan.javapractice.stream;

import java.util.Arrays;
import java.util.List;

import org.alan.javapractice.stream.stream.Member;

public class reduction {

    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3,4,5,6,7,8,9,0};

        long count = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .count();
        System.out.println(count);

        long sum = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .sum();
        System.out.println(sum);

        double avg = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .average()
            .getAsDouble();
        System.out.println(avg);

        Arrays.stream(ints)
            .filter(i -> i%6 == 0)
            .average()
            .ifPresent(System.out::println);

        List<Member> members = Arrays.asList(
            new Member("hong", Member.MALE, 92),
            new Member("dong", Member.MALE, 52),
            new Member("kong", Member.MALE, 32)
        );

        int sum1 =members.stream()
            .mapToInt(Member::getAge)
            .sum();
        System.out.println(sum1);

        int sum2 = members.stream()
            .map(Member::getAge)
            .reduce(Integer::sum)
            .get();
        System.out.println(sum2);

        int sum3 = members.stream()
            .map(Member :: getAge)
            .reduce(0, Integer::sum);
        System.out.println(sum2);
    }
}
