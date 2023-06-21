package org.alan.java.stream.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.alan.java.stream.stream.Member;

public class CollectExample {

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("hong", Member.MALE, 30),
            new Member("kong", Member.MALE, 40),
            new Member("song", Member.FEMALE, 18),
            new Member("dong", Member.FEMALE, 18),
            new Member("bong", Member.MALE, 70)
        );

        List<Member> maleList = members.stream()
            .filter(member -> member.getSex() == Member.MALE)
            .collect(Collectors.toList());

        List<Member> maleList2 = members.stream()
            .filter(member -> member.getSex() == Member.MALE)
            .toList();

        Set<Member> femaleList = members.stream()
            .filter(member -> member.getSex() == Member.FEMALE)
            .collect(Collectors.toCollection(HashSet::new));

        Set<Member> femaleList2 = members.stream()
            .filter(member -> member.getSex() == Member.FEMALE)
            .collect(Collectors.toCollection(() -> new HashSet<>()));


    }

}
