package com.dimidev.adapterpattern;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Dimiduck duckIF;
    Random rand;

    public DuckAdapter(Dimiduck duckIF) {
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