package org.learning.animals;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("bau bau");
    }

    @Override
    void eat() {
        System.out.println("meat");
    }
}
