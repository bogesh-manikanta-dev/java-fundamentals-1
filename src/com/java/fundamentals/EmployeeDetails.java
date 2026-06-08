package com.java.fundamentals;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Department Code: ");
        char departmentCode = sc.next().charAt(0);

        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        short yearsOfExperience = sc.nextShort();

        System.out.print("Enter Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Is Permanent Employee (true/false): ");
        boolean isPermanentEmployee = sc.nextBoolean();

        System.out.print("Enter Performance Rating: ");
        float performanceRating = sc.nextFloat();

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Age: " + age);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Is Permanent Employee: " + isPermanentEmployee);
        System.out.println("Performance Rating: " + performanceRating);

        sc.close();
    }
}
