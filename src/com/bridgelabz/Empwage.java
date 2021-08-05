package com.bridgelabz;

public class Empwage {
            public static void main(String[] args) {

                System.out.println("Welcome to Bridgelabz EmployeeWageBuilder");
//constant
                int IS_PRESENT = 1;
                int FULL_TIME=8;
                int EMP_WAGE_PER_HR=20;
                int empCheck = (int) Math.floor(Math.random() * 10) % 2;
                int calcWage=0;
                if (empCheck == IS_PRESENT) {
                    System.out.println(" Employee is Present");
                    calcWage = FULL_TIME * EMP_WAGE_PER_HR;
                }
                else
                    System.out.println(" Employee is Absent");
                System.out.println("Employeee daily wage =" +calcWage+ "RS");
            }
        }


