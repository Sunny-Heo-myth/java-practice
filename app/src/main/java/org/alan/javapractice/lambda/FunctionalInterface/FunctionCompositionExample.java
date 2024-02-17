package org.alan.javapractice.lambda.FunctionalInterface;

import java.util.function.Function;

public class FunctionCompositionExample {

    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionC;
        String city;

        functionA = Member::getAddress;
        functionB = Address::getCity;
        functionC = functionB.compose(functionA);

        Member member = new Member("hong", "hsymyth", new Address("Korea", "Seoul"));
        city = functionC.apply(member);

        System.out.println(city);
    }
}
