package org.learning.animals;

public class Main {
    public static void main(String[] args) {

        System.out.println("New Dog");
        Dog husky = new Dog();
        husky.sound();
        husky.eat();
        husky.sleep();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("New Dolphin");
        Dolphin bob = new Dolphin();
        bob.sound();
        bob.eat();
        bob.sleep();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("New Hawk");
        Hawk murica = new Hawk();
        murica.sound();
        murica.eat();
        murica.sleep();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("New Sparrow");
        Sparrow jack = new Sparrow();
        jack.sound();
        jack.eat();
        jack.sleep();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
    }
}
