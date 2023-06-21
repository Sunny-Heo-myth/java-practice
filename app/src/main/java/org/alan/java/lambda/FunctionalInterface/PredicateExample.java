package org.alan.java.lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.alan.java.stream.stream.Member;

public class PredicateExample {

    private static final List<org.alan.java.stream.stream.Member> memberList = Arrays.asList(
        new org.alan.java.stream.stream.Member("Hong", org.alan.java.stream.stream.Member.MALE, 20),
        new org.alan.java.stream.stream.Member("Song", org.alan.java.stream.stream.Member.FEMALE, 30),
        new org.alan.java.stream.stream.Member("Dong", org.alan.java.stream.stream.Member.MALE, 40)
    );

    public static double avg(Predicate<org.alan.java.stream.stream.Member> predicate) {
        int count = 0, sum = 0;
        for (org.alan.java.stream.stream.Member member : memberList) if (predicate.test(member)) {
            count++;
            sum += member.getAge();
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(member -> member.getSex() == org.alan.java.stream.stream.Member.MALE);
        System.out.println(maleAvg);

        double femaleAvg = avg(member -> member.getSex() == Member.FEMALE);
        System.out.println(femaleAvg);
    }
}
