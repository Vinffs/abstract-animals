package org.learning.animals;

public class Sparrow extends Animal implements CanFly {
    @Override
    void sound() {
        System.out.println("cip cip");
    }

    @Override
    void eat() {
        System.out.println("seeds");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying!!!!");
    }
}
