package org.learning.animals;

public class Hawk extends Animal implements CanFly{
    @Override
    void sound() {
        System.out.println("scree");
    }

    @Override
    void eat() {
        System.out.println("meat");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying!!!!");
    }
}
