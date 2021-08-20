package com.bridgelabz;

public class Empwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;


    public static int Empwage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {

        int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;

        while (totalemphrs <= maxHoursPerMonth && totalworkingdays <= numOfWorkingDays) {
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
            totalemphrs += emphrs;
            System.out.println("Day : " + totalworkingdays + "Emphr :" + emphrs);
        }
        int totalEmpWage = totalemphrs * empRatePerHr;
        System.out.println("Total Empwage for company:" +company+ "is:" +totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        Empwage("dmart",20,2,10);
        Empwage("reliance",20,2,10);
    }
}








