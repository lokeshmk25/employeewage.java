package com.bridgelabz;

public class Empwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;

    public static void main(String[] arg) {
        int calcWage = 0;
        int emphrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case FULL_TIME:
                emphrs = 8;
                break;
            case PART_TIME:
                emphrs = 4;
                break;
            default:
                emphrs = 0;
        }
        calcWage = emphrs * EMP_WAGE_PER_HR;
        System.out.println("Employeee daily wage =" + calcWage + "rs");
    }
}


