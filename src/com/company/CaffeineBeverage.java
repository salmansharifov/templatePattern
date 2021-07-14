package com.company;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("water is boiling");
    }

    void pourInCup() {
        System.out.println("pouring to cup");
    }

    abstract void brew();

    abstract void addCondiments();
}
