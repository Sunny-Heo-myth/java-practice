package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import org.alan.javapractice.stream.stream.Member;

public class FunctionExample {

    private static final List<org.alan.javapractice.stream.stream.Member> memberList = Arrays.asList(
        new org.alan.javapractice.stream.stream.Member("hong", org.alan.javapractice.stream.stream.Member.MALE, 13),
        new org.alan.javapractice.stream.stream.Member("kong", org.alan.javapractice.stream.stream.Member.MALE, 25),
        new org.alan.javapractice.stream.stream.Member("Song", org.alan.javapractice.stream.stream.Member.FEMALE, 53)
    );

    private static void supplyString (Function<org.alan.javapractice.stream.stream.Member, String> function) {
        for (org.alan.javapractice.stream.stream.Member member : memberList) {
            System.out.println(function.apply(member) + " ");
        }
        System.out.println();
    }

    private static void supplyInt (ToIntFunction<org.alan.javapractice.stream.stream.Member> function) {
        for (org.alan.javapractice.stream.stream.Member member : memberList) {
            System.out.println(function.applyAsInt(member) + " ");
        }
        System.out.println();
    }

    private static double avg (ToIntFunction<org.alan.javapractice.stream.stream.Member> function) {
        int sum = 0;
        for (org.alan.javapractice.stream.stream.Member member : memberList) sum += function.applyAsInt(member);
        return (double) sum / memberList.size();
    }


    public static void main(String[] args) {
        supplyString(org.alan.javapractice.stream.stream.Member::getName);
        supplyInt(org.alan.javapractice.stream.stream.Member::getSex);
        supplyInt(org.alan.javapractice.stream.stream.Member::getAge);

        System.out.println(avg(Member::getAge));
    }

}
