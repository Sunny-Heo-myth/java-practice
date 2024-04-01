package org.alan.javapractice.stream.collect;

import org.alan.javapractice.stream.stream.Member;

import java.util.Arrays;
import java.util.List;

public class MaleMemberExample {

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("hong", Member.MALE, 30),
            new Member("kong", Member.MALE, 40),
            new Member("song", Member.FEMALE, 18),
            new Member("dong", Member.FEMALE, 18),
            new Member("bong", Member.MALE, 70)
        );

        MaleMember maleMember = members.stream()
            .filter(member -> member.getSex() == Member.MALE)
            .collect(MaleMember::new, MaleMember::accumulate, MaleMember::combine);

        maleMember.getList().stream()
            .forEach(member -> System.out.println(member.getName()));
    }
}
