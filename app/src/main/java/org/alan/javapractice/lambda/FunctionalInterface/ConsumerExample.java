package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

import org.alan.javapractice.stream.stream.Member;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = s
            -> System.out.println("Consumer Functional Interface : " + s);
        consumer.accept("consumer");

        BiConsumer<String, Integer> biConsumer = (s, i)
            -> System.out.println("BiConsumer Functional Interface : " + s + " " + i);
        biConsumer.accept("biConsumer", 1);

        ObjIntConsumer<org.alan.javapractice.stream.stream.Member> objIntConsumer = (member, i)
            -> System.out.println("ObjIntConsumer Functional InterFace : " + member + " " + i);
        objIntConsumer.accept(new org.alan.javapractice.stream.stream.Member("hong", Member.MALE, 30), 100);
    }
}
