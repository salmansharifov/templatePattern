package com.company;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("dripping coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
