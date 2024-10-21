package com.COMP2013;

public abstract class Employee implements Employable {
    private int employeeID;
    private String employeeName;
    private int salary;

    // constructor
    public Employee(int employeeID, String employeeName, int salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public void setEmployeeID(int number) {
        this.employeeID = number;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int calculateChristmasBonus() {
        // can be overridden by subclasses if necessary
        return 0; // no bonus by default
    }
}