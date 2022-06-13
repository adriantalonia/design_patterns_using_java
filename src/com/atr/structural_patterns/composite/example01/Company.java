package com.atr.structural_patterns.composite.example01;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(101, "Jaon Fedin", "Senior Developer");
        Employee dev2 = new Developer(102, "Myra Fedin", "Junior Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager(201, "Jennifer Fedin", "SEO Manager");
        Employee man2 = new Manager(202, "Ian Fedin", "SEO Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
