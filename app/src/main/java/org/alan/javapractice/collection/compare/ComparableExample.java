package org.alan.javapractice.collection.compare;

import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();

        personTreeSet.add(new Person("kim", 45));
        personTreeSet.add(new Person("lim", 23));
        personTreeSet.add(new Person("sim", 3));
        personTreeSet.add(new Person("pim", 99));
        personTreeSet.add(new Person("xim", 63));

        StringBuilder sb1 = new StringBuilder();
        personTreeSet
            .forEach(person -> sb1.append(person.name).append(" : ").append(person.age).append("\n"));
        System.out.println(sb1);
    }
}
