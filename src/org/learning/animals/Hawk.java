package org.learning.animals;

public class Hawk extends Animal{
    @Override
    void sound() {
        System.out.println("scree");
    }

    @Override
    void eat() {
        System.out.println("meat");
    }
}
