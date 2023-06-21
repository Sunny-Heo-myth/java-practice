package org.alan.java.stream.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectListExample {

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("hong", Member.MALE, 30),
            new Member("kong", Member.MALE, 40),
            new Member("song", Member.FEMALE, 18),
            new Member("dong", Member.FEMALE, 18),
            new Member("bong", Member.MALE, 70)
        );
        
        List<Member> males = members.stream()
            .filter(member -> member.getSex() == Member.MALE)
            .collect(Collectors.toList());
        
        males.stream()
            .forEach(System.out::println);
        
        Set<Member> females = members.stream()
            .filter(member -> member.getSex() == Member.FEMALE)
            .collect(Collectors.toCollection(HashSet::new));
        
        females.stream()
            .forEach(System.out::println);
    }
}
