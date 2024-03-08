package Payroll;

import java.io.*;
import java.util.Scanner;

public class UserInfoService {
    private static final String EMPLOYEE_INFO_FILE = "data/EmployeeInfo.txt";

    public static String readEmployeeInfo() {
        StringBuilder info = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(EMPLOYEE_INFO_FILE))) {
            while (scanner.hasNextLine()) {
                info.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + EMPLOYEE_INFO_FILE);
        }
        return info.toString();
    }

    public static void updateEmployeeInfo(String newInfo) {
        try (PrintWriter out = new PrintWriter(EMPLOYEE_INFO_FILE)) {
            out.println(newInfo);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + EMPLOYEE_INFO_FILE);
        }
    }
}


//Abstraction: UserInfoService abstract the details of file handling, providing simple methods for reading and updating information. This hides the complexity of file I/O operations from the rest of the application.
