package Payroll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			LoginService loginService = new LoginService();

			System.out.println("Welcome to the Java Auth System");
			System.out.print("Username: ");
			String username = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();

			User user = loginService.authenticate(username, password);

			if (user != null) {
			    System.out.println("Login successful. Welcome, " + user.getUsername() + "!" + "\n");
			    user.showOptions();
			} else {
			    System.out.println("Login failed. Please check your credentials.");
			}
		}
    }
}