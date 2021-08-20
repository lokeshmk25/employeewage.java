package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Empwage implements IComputeEmpwage {
    //constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    private int numofCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public Empwage() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        return 0;
    }

    public static void main(String[] args) {
        IComputeEmpwage EmpwageBuilder = new Empwage() {
            @Override
            public String getTotalWage(String company) {
                return "Total Emp Wage for Company:" + company ;
            }
        };
        EmpwageBuilder.addCompanyEmpWage("dmart",20,2,10);
        EmpwageBuilder.addCompanyEmpWage("reliance",10,4,20);
        System.out.println("Total Wage For Dmart company:" +EmpwageBuilder.getTotalWage("dmart"));
        System.out.println("Total Wage For Dmart company:" +EmpwageBuilder.getTotalWage("relaince"));
    }

}





