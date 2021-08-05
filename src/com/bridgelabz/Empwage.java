package com.bridgelabz;

public class Empwage {
            public static void main(String[] args) {

                System.out.println("Welcome to Bridgelabz EmployeeWageBuilder");
//constant
                int PART_TIME = 1;
                int FULL_TIME=2;
                int EMP_WAGE_PER_HR=20;
                int calcWage=0;
                int emphrs=0;
                double empCheck = (int) Math.floor(Math.random() * 10) % 3;
                if (empCheck == FULL_TIME)
                    emphrs = 8;
                else if (empCheck == PART_TIME )
                    emphrs = 4;
                calcWage = emphrs * EMP_WAGE_PER_HR;
                System.out.println("Employeee daily wage =" +calcWage+ "RS");
            }
        }


