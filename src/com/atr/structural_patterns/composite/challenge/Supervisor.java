package com.atr.structural_patterns.composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String department;

    private List<Faculty> myFaculties;

    public Supervisor(String name, String department) {
        this.name = name;
        this.department = department;
        myFaculties = new ArrayList<Faculty>();
    }

    public void add(Faculty professor) {
        myFaculties.add(professor);
    }

    public void remove(Faculty professor) {
        myFaculties.remove(professor);
    }

    public List<Faculty> getMyFaculties() {
        return myFaculties;
    }

    @Override
    public String getDetails() {
        return (name + " is the " + department);
    }
}
