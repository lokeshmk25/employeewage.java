package com.bridgelabz;

public class Empwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public Empwage(String company, int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth){
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this .maxHoursPerMonth = maxHoursPerMonth;

    }

    public static void main(String[] args) {

        Empwage obj = new Empwage("Reliance",20,30,50);
        int emphrs = 0,totalemphrs = 0,totalworkingdays=0;

        while (totalemphrs <= obj.maxHoursPerMonth && totalworkingdays <= obj.numOfWorkingDays) {
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
            System.out.println("Day : " +totalworkingdays+  "Emphr :" +emphrs);
        }
        int totalEmpWage = totalemphrs * obj.empRatePerHr;
        System.out.println("Total EmpWage for Company :" +obj.company+ "is:" +totalEmpWage);
        }

    }








