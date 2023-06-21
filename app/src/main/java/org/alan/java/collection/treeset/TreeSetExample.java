package org.alan.java.collection.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(87);
        integerTreeSet.add(32);
        integerTreeSet.add(52);
        integerTreeSet.add(16);
        integerTreeSet.add(61);
        integerTreeSet.add(77);
        integerTreeSet.add(57);
        integerTreeSet.add(44);

        Integer integer = null;

        StringBuilder sb = new StringBuilder();
        sb.append(integerTreeSet.first()).append("\n")
            .append(integerTreeSet.last()).append("\n")
            .append(integerTreeSet.lower(55)).append("\n")
            .append(integerTreeSet.higher(44)).append("\n");

        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        NavigableSet<Integer> descendingSet = integerTreeSet.descendingSet();
        descendingSet
            .forEach(i -> sb2.append(i).append(" "));
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder();
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        ascendingSet
            .forEach(i -> sb3.append(i).append(" "));
        System.out.println(sb3);

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("strawberry");
        stringTreeSet.add("tomato");
        stringTreeSet.add("watermelon");

        StringBuilder sb4 = new StringBuilder();
        NavigableSet<String> stringNavigableSet = stringTreeSet.subSet("a", true, "f", true);
        stringNavigableSet
            .forEach(str -> sb4.append(str).append("\n"));
        System.out.println(sb4);

        System.out.println("-----------------");

        StringBuilder sb5 = new StringBuilder();
        stringTreeSet.stream()
            .filter(str -> str.charAt(1) >= 97 && str.charAt(1) <= 102)
            .forEach(str -> sb5.append(str).append("\n"));
        System.out.println(sb5);
    }
}
