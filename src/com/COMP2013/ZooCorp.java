package com.COMP2013;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employee> staff;

    public ZooCorp(Zoo zoos) {
        this.zoos = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    // add zoo to ZooCorp
    public void addZoo(Zoo zoo) {
        zoos.add(zoo);
    }

    // add employee to staff list
    public void addEmployee(Employee employee) {
        staff.add(employee);
    }

    public ArrayList<Zoo> getZoos() {
        return zoos;
    }
}