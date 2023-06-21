package org.alan.java.lambda.FunctionalInterface;

import java.util.function.Consumer;

import org.alan.java.stream.stream.Member;

public class AndThenExample {

    public static void main(String[] args) {
        Consumer<org.alan.java.stream.stream.Member> consumerA = member -> System.out.println("consumerA : " + member.getName());
        Consumer<org.alan.java.stream.stream.Member> consumerB = member -> System.out.println("consumerB : " + member.getAge());

        Consumer<org.alan.java.stream.stream.Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("hong", 3, 30));
    }
}
