package org.learning.animals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    void sound() {
        System.out.println("whistle");
    }

    @Override
    void eat() {
        System.out.println("fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm Swimming!!!!");
    }
}
