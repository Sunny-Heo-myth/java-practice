package org.alan.java.collection.compare;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.age);
    }

//    @Override
//    public int compareTo(Person person) {
//        if (age < person.age) return -1;
//        else if (age == person.age) return 0;
//        else return 1;
//    }
}
