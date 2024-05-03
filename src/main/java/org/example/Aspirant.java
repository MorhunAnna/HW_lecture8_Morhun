package org.example;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        if (averageMark == 5.0) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
    @Override
        public void info ()
        {
            super.info();
            System.out.println("Scientific work: " + scientificWork);
        }
    }

