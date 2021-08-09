package com.bridgelabz;

public class Empwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS = 100;

    public static int computeEmpWage() {
        int calcWage = 0;
        int emphrs = 0;
        int Empwage_per_month = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;

        while (totalemphrs <= MAX_HRS && totalworkingdays <= NUM_OF_WORKING_DAYS) {
            totalworkingdays++;
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
            Empwage_per_month += calcWage;
            totalemphrs += emphrs;

            System.out.println("Employeee daily wage =" + calcWage + "rs");
        }
        System.out.println("Employee wage per month=" + Empwage_per_month + "rs");
        return calcWage;
        }
    public static void main(String[] args) {
        computeEmpWage();
    }

}







