package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Random getRandom() {
        return random;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }

}
