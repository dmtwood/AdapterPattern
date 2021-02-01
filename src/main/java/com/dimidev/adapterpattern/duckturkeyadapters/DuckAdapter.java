package com.dimidev.adapterpattern.duckturkeyadapters;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duckIF;
    Random rand;

    public DuckAdapter(Duck duckIF) {
        this.duckIF = duckIF;
        rand = new Random();
    }

    public void gobble() {
        duckIF.quack();
    }

    public void fly() {
        if (rand.nextInt(5)  == 0) {
            duckIF.fly();
        }
    }
}