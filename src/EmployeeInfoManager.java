package Payroll;

import java.io.PrintWriter;

public class EmployeeInfoManager {
    private static final String EMPLOYEE_INFO_FILE = "data/EmployeeInfo.txt";

    public static void updateEmployeeInfo(String empNumber, String name, String address, String email, String sss, String tin, String philhealth, String pagIbig) {
        // Assuming you want to overwrite the existing info with the new one
        try (PrintWriter out = new PrintWriter(EMPLOYEE_INFO_FILE)) {
            out.println("Employee Number: " + empNumber);
            out.println("Name: " + name);
            out.println("Address: " + address);
            out.println("Email: " + email);
            out.println("SSS: " + sss);
            out.println("TIN: " + tin);
            out.println("Philhealth: " + philhealth);
            out.println("Pag-ibig: " + pagIbig);
            out.println("Success Edit!");
        } catch (Exception e) {
            System.err.println("Error writing to EmployeeInfo.txt: " + e.getMessage());
        }
    }
}