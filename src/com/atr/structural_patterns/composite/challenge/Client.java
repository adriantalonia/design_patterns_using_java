package com.atr.structural_patterns.composite.challenge;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairMathDepartment = new Supervisor("Dr. John", "Chair of Math");
        Supervisor chairComputer = new Supervisor("Dr. Ian", "Chair of Computer Science");

        Professor mathProf01 = new Professor("Math Professor1", "Adjunct", 302);
        Professor mathProf02 = new Professor("Math Professor1", "Associate", 303);

        Professor cseProf01 = new Professor("CSE Professor1", "", 501);
        Professor cseProf02 = new Professor("CSE Professor2", "", 502);
        Professor cseProf03 = new Professor("CSE Professor3", "", 503);

        techDean.add(chairMathDepartment);
        techDean.add(chairComputer);

        chairMathDepartment.add(mathProf01);
        chairMathDepartment.add(mathProf02);

        chairComputer.add(cseProf01);
        chairComputer.add(cseProf02);
        chairComputer.add(cseProf03);

        System.out.println("***Composite Pattern Demo***");
        System.out.println("\nTHe college has the following structure\n");

        System.out.println(techDean.getDetails());
        List<Faculty> chairs = techDean.getMyFaculties();
        for (Faculty chair : chairs) {
            System.out.println("\t\t" + chair.getDetails());
        }

        List<Faculty> mathProfessors = chairMathDepartment.getMyFaculties();
        for (Faculty mprof : mathProfessors) {
            System.out.println("\t\t" + mprof.getDetails());
        }

        List<Faculty> cseProfessors = chairComputer.getMyFaculties();
        for (Faculty cseProd : cseProfessors) {
            System.out.println("\t\t" + cseProd.getDetails());
        }

        chairComputer.remove(cseProf02);

        System.out.println("\n After CSE Professor 2 leaving the organization - CSE department has follow");
        cseProfessors = chairComputer.getMyFaculties();
        for (Faculty cseProd : cseProfessors) {
            System.out.println("\t\t" + cseProd.getDetails());
        }

    }
}
