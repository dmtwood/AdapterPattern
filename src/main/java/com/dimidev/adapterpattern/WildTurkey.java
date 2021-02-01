package com.dimidev.adapterpattern;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobbling");
    }

    public void fly() {
        System.out.println("I'm kinda flying");
    }
}
