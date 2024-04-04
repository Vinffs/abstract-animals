package org.learning.animals;

public class Sparrow extends Animal {
    @Override
    void sound() {
        System.out.println("cip cip");
    }

    @Override
    void eat() {
        System.out.println("seeds");
    }
}
