package org.alan.javapractice.collection.compare;

import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String[] args) {
        TreeSet<Fruit> fruitTreeSet = new TreeSet<>(new FruitComparator());

        fruitTreeSet.add(new Fruit("kim", 45));
        fruitTreeSet.add(new Fruit("lim", 23));
        fruitTreeSet.add(new Fruit("sim", 3));
        fruitTreeSet.add(new Fruit("pim", 99));
        fruitTreeSet.add(new Fruit("xim", 63));
        
    }
}
