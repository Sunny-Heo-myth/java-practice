package org.alan.java.stream.stream;

import java.util.Arrays;
import java.util.List;

public class PipelineExample {

    public static void main(String[] args) {
        List<Member> members =Arrays.asList(
            new Member("hong", Member.MALE, 30),
            new Member("kong", Member.MALE, 40),
            new Member("song", Member.FEMALE, 18),
            new Member("dong", Member.FEMALE, 18),
            new Member("bong", Member.MALE, 70)
        );

        double average = members.stream()
            .filter(member -> member.getSex() == Member.MALE)
            .mapToInt(Member::getAge)
            .average()
            .getAsDouble();

        System.out.println(average);

    }

}
