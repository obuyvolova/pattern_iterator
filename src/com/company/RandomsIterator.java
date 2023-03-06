package com.company;

import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {
    Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.getRandom().nextInt(randoms.getMin(), randoms.getMax() + 1);
    }
}
