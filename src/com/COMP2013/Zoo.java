package com.COMP2013;

import java.util.ArrayList;

public class Zoo {
    // variable declarations
    private String location;
    private int numCompounds;
    private int zooID; // unique ID for each zoo
    static int numZoos = 0; // static var to count zoos
    private ArrayList<Compound> compounds;
    private ArrayList<Employee> employees;

    // default constructor
    public Zoo() {
        this.location = "Unknown";
        this.numCompounds = 30; // default number of compounds
        this.zooID = ++numZoos; // increment for each new zoo
        this.compounds = new ArrayList<>();
    }

    // parameterised constructor
    public Zoo(String location, int numCompounds) {
        this.location = location;
        this.numCompounds = numCompounds;
        this.zooID = ++numZoos;
        this.compounds = new ArrayList<>();
    }

    // build new compound
    public void buildNewCompound() {
        this.numCompounds++;
    }

    // add new compound
    public void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    // print zoo info
    public String printInfo() {
        return "Zoo ID: " + zooID + ", Location: " + location + ", Number of Compounds: " + numCompounds;
    }

    // print total zoos
    public static int getTotalZoos() {
        return numZoos;
    }
}