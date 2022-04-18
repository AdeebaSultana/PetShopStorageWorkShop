package com.bridgelabz.pet.shop.storage;
public class Cat extends Pet {
    Cat() {
        name = "Mia";
        colour = Colour.GREY;
}

    @Override
    void fly() {
        System.out.println();
    }

    @Override
    void swim() {
        System.out.println();
    }
}