package Payroll;

import java.io.PrintWriter;

public class SalaryManager {
    private static final String SALARY_INFO_FILE = "data/SalaryInfo.txt";

    public static void updateSalaryInfo(double grossSalary, double bonus, double tax, double netSalary) {
        try (PrintWriter out = new PrintWriter(SALARY_INFO_FILE)) {
            out.println("Gross Salary: " + grossSalary);
            out.println("Bonus: " + bonus);
            out.println("Tax: " + tax);
            out.println("Net Salary: " + netSalary);
        } catch (Exception e) {
            System.err.println("Error writing to SalaryInfo.txt: " + e.getMessage());
        }
    }
}