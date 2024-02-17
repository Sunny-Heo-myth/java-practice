package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.function.Consumer;

import org.alan.javapractice.stream.stream.Member;

public class AndThenExample {

    public static void main(String[] args) {
        Consumer<org.alan.javapractice.stream.stream.Member> consumerA = member -> System.out.println("consumerA : " + member.getName());
        Consumer<org.alan.javapractice.stream.stream.Member> consumerB = member -> System.out.println("consumerB : " + member.getAge());

        Consumer<org.alan.javapractice.stream.stream.Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("hong", 3, 30));
    }
}
