package com.bridgelabz.pet.shop.storage;

import java.util.Objects;
public abstract class Pet {
    enum Colour {
        RED, GREEN, WHITE, BLACK, GREY, BLACK_WHITE
    }

    String id;
    String name;
    Colour colour;
    int price;

    void eat() {
        System.out.println(getClass().getSimpleName() + "Pets eat");
    }

    void fly() {
        System.out.println(getClass().getSimpleName() + "Pets fly");
    }

    void swim() {
        System.out.println(getClass().getSimpleName() + "Pets swim");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", colour='" + colour + '\'' + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
