package org.learning.animals;

public class Dolphin extends Animal {
    @Override
    void sound() {
        System.out.println("whistle");
    }

    @Override
    void eat() {
        System.out.println("fish");
    }
}
