package com.COMP2013;

import java.util.ArrayList;

public class Compound {
    private String type; // e.g., cage, tank, field, etc
    private ArrayList<Animal> animals;

    public Compound(String type) {
        this.type = type;
        this.animals = new ArrayList<>();
    }

    // add animal to compound
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public String getName() {
        return type;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void printInfo() {
        System.out.println("Compound Type: " + type);
        System.out.println("Animals in this compound:");
        for (Animal animal : animals) {
            System.out.println("- " + animal);
        }
    }
}