package com.raja.example;

public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog Constructor called");
    }

    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}
