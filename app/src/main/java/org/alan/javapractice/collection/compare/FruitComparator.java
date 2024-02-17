package org.alan.javapractice.collection.compare;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit p1, Fruit p2) {
        if (p1.price < p2.price) return 1;
        else if (p1.price == p2.price) return  0;
        else return -1;
    }
}
