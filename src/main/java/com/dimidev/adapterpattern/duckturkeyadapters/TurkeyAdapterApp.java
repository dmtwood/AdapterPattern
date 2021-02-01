package com.dimidev.adapterpattern.duckturkeyadapters;

public class TurkeyAdapterApp {
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
}
