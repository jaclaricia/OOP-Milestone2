package Payroll;

//Inheritance is demonstrated by Employee, Admin, and Payroll classes extending the User class. They inherit User class properties and methods while also providing specific implementations for the showOptions method.

import java.util.Scanner;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showOptions() {
        System.out.println("1. Edit Employee Information");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (choice == 1) {
            editEmployeeInfo();
        } else {
            System.out.println("Invalid option selected.");
        }
    }

    public static void editEmployeeInfo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Editing Employee Information");
            // Capture user input for each field
            System.out.print("Employee Number: ");
            String empNumber = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("SSS: ");
            String sss = scanner.nextLine();
            System.out.print("TIN: ");
            String tin = scanner.nextLine();
            System.out.print("Philhealth: ");
            String philhealth = scanner.nextLine();
            System.out.print("Pag-ibig: ");
            String pagIbig = scanner.nextLine();

            EmployeeInfoManager.updateEmployeeInfo(empNumber, name, address, email, sss, tin, philhealth, pagIbig);
        }
    }
}