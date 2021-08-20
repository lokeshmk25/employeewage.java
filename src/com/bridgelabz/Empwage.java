package com.bridgelabz;

public class Empwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public Empwage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;

    }

    public void ComputeEmpWage() {
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
        totalEmpWage = totalemphrs * empRatePerHr;
    }

    @Override
    public String toString() {
        return "Total EmpWage for company :" + company + "is:" + totalEmpWage;
    }


    public static void main(String[] args) {
        Empwage dmart = new Empwage("dmart", 20, 2, 10);
        Empwage reliance = new Empwage("reliance", 10, 4, 20);
        dmart.ComputeEmpWage();
        System.out.println(dmart);
        reliance.ComputeEmpWage();
        System.out.println(reliance);
    }
}








