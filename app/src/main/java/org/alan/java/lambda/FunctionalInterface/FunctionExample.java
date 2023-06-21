package org.alan.java.lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import org.alan.java.stream.stream.Member;

public class FunctionExample {

    private static final List<org.alan.java.stream.stream.Member> memberList = Arrays.asList(
        new org.alan.java.stream.stream.Member("hong", org.alan.java.stream.stream.Member.MALE, 13),
        new org.alan.java.stream.stream.Member("kong", org.alan.java.stream.stream.Member.MALE, 25),
        new org.alan.java.stream.stream.Member("Song", org.alan.java.stream.stream.Member.FEMALE, 53)
    );

    private static void supplyString (Function<org.alan.java.stream.stream.Member, String> function) {
        for (org.alan.java.stream.stream.Member member : memberList) {
            System.out.println(function.apply(member) + " ");
        }
        System.out.println();
    }

    private static void supplyInt (ToIntFunction<org.alan.java.stream.stream.Member> function) {
        for (org.alan.java.stream.stream.Member member : memberList) {
            System.out.println(function.applyAsInt(member) + " ");
        }
        System.out.println();
    }

    private static double avg (ToIntFunction<org.alan.java.stream.stream.Member> function) {
        int sum = 0;
        for (org.alan.java.stream.stream.Member member : memberList) sum += function.applyAsInt(member);
        return (double) sum / memberList.size();
    }


    public static void main(String[] args) {
        supplyString(org.alan.java.stream.stream.Member::getName);
        supplyInt(org.alan.java.stream.stream.Member::getSex);
        supplyInt(org.alan.java.stream.stream.Member::getAge);

        System.out.println(avg(Member::getAge));
    }

}
