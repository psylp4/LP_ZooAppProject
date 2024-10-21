package com.COMP2013;

public class Animal implements Maintainable {
    private String name;
    private String species;
    private int age;

    // constructor
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // eat method
    public void eat() {
        System.out.println(name + " the " + species + " is eating.");
    }

    // enjoy method
    public void enjoy() {
        System.out.println(name + " the " + species + " is enjoying its time.");
    }

    // maintain method
    @Override
    public void maintain() {
        System.out.println("Maintaining the habitat of " + name + " the " + species + ".");
    }

    // toString method
    @Override
    public String toString() {
        return name + " (" + species + "), Age: " + age;
    }
}