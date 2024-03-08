package Payroll;

//Inheritance is demonstrated by Employee, Admin, and Payroll classes extending the User class. They inherit User class properties and methods while also providing specific implementations for the showOptions method.

import java.util.Scanner;

public class Payroll extends User {
    public Payroll(String username, String password) {
        super(username, password);
    }

    @Override
    public void showOptions() {
        System.out.println("1. Edit Employee Payroll");
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline

			if (choice == 1) {
			    editEmployeePayroll();
			} else {
			    System.out.println("Invalid option selected.");
			}
		}
    }

    public static void editEmployeePayroll() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Editing Employee Payroll");
            // Capture user input for each field
            System.out.print("Gross Salary: ");
            double grossSalary = scanner.nextDouble();
            System.out.print("Bonus: ");
            double bonus = scanner.nextDouble();
            System.out.print("Tax: ");
            double tax = scanner.nextDouble();

            // Assuming the need to compute net salary
            double netSalary = (grossSalary + bonus) - tax;
            System.out.print("Net Salary: " + netSalary);
            SalaryManager.updateSalaryInfo(grossSalary, bonus, tax, netSalary);
        }
    }
}