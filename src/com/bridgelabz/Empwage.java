package com.bridgelabz;

public class Empwage {
            public static void main(String[] args) {

                System.out.println("Welcome to Bridgelabz EmployeeWageBuilder");
//constant
                int IS_PRESENT = 1;

                int empCheck = (int) Math.floor(Math.random() * 10) % 2;
                if (empCheck == IS_PRESENT)
                    System.out.println(" Employee is Present");
                else
                    System.out.println(" Employee is Absent");
            }
        }


