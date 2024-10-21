package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {
        // create zoo objects
        Zoo zoo1 = new Zoo("London", 50);
        ZooCorp megaZoo = new ZooCorp(zoo1);

        Zoo zoo2 = new Zoo("Tokyo", 40);
        megaZoo.addZoo(zoo2);

        Zoo zoo3 = new Zoo("New York", 35);
        Zoo zoo4 = new Zoo("Paris", 25);
        Zoo zoo5 = new Zoo("Beeston", 47);

        // print info
        System.out.println(zoo1.printInfo());
        System.out.println(zoo2.printInfo());
        System.out.println(zoo3.printInfo());
        System.out.println(zoo4.printInfo());
        System.out.println(zoo5.printInfo());

        // test
        zoo5.buildNewCompound();
        System.out.println(zoo5.printInfo());
        System.out.println("Number of Zoos: " + Zoo.numZoos);
        Employee sue = new ZooKeeper(1, "Sue", 25000);
        Employee bob = new Admin(2, "Bob", 25000);
        megaZoo.addEmployee(sue);
        megaZoo.addEmployee(bob);

        // output
        System.out.println(sue.getClass().getSimpleName() + ": " + sue.getEmployeeName() + ": " + sue.calculateChristmasBonus());
        System.out.println(bob.getClass().getSimpleName() + ": " + bob.getEmployeeName() + ": " + bob.calculateChristmasBonus());
    }
}