package Payroll;

import java.io.*;
import java.util.Scanner;

public class PayrollService {
    private static final String SALARY_INFO_FILE = "data/SalaryInfo.txt";

    public static String readSalaryInfo() {
        StringBuilder info = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(SALARY_INFO_FILE))) {
            while (scanner.hasNextLine()) {
                info.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + SALARY_INFO_FILE);
        }
        return info.toString();
    }

    public static void updateSalaryInfo(String newInfo) {
        try (PrintWriter out = new PrintWriter(SALARY_INFO_FILE)) {
            out.println(newInfo);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + SALARY_INFO_FILE);
        }
    }
}

//Abstraction: PayrollService abstract the details of file handling, providing simple methods for reading and updating information. This hides the complexity of file I/O operations from the rest of the application.