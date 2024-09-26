package com.Employee;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computtaion!!");

        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        int WAGE_PER_HR = 20;
        int workingHours = 0;

        int empType =(int) Math.floor(Math.random() * 10) % 3;
        switch (empType)
        {
            case FULL_TIME:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case PART_TIME:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}