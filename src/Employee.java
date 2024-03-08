package Payroll;

//Inheritance is demonstrated by Employee, Admin, and Payroll classes extending the User class. They inherit User class properties and methods while also providing specific implementations for the showOptions method.

import java.util.Scanner;

public class Employee extends User {
    public Employee(String username, String password) {
        super(username, password);
    }

    @Override
    public void showOptions() {
        System.out.println("1. View information\n2. View Salary");
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter option: ");
			int choice = scanner.nextInt();

			switch (choice) {
			    case 1:
			        // View Information
			        System.out.println("Employee Information:");
			        System.out.println(UserInfoService.readEmployeeInfo());
			        break;
			    case 2:
			        // View Salary
			        System.out.println("Salary Information:");
			        System.out.println(PayrollService.readSalaryInfo());
			        break;
			    default:
			        System.out.println("Invalid option selected.");
			        break;
			}
		}
    }
}