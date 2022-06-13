package com.atr.structural_patterns.composite.example02;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(101, "Jaon Fedin", "Senior Developer");
        Employee dev2 = new Developer(102, "Myra Fedin", "Junior Developer");

        Manager engDirectory = new Manager("Mike Hide", 2500);
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee dev3 = new Developer(102, "Eduar Fedin", "Ssr Developer");

        Manager generalManager = new Manager("Mark Chive", 5000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engDirectory);
        generalManager.showEmployeeDetails();

    }
}
