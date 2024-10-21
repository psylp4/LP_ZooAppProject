package com.COMP2013;

public class Admin extends Employee {
    public Admin(int employeeID, String employeeName, int salary) {
        super(employeeID, employeeName, salary);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (getSalary() * 0.08); // override for Admin bonus
    }
}