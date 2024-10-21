package com.COMP2013;

public class ZooKeeper extends Employee {
    public ZooKeeper(int employeeID, String employeeName, int salary) {
        super(employeeID, employeeName, salary);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (getSalary() * 0.05 + 100); // override for Zookeeper bonus
    }
}