package Payroll;

//This class demonstrates encapsulation and abstraction by hiding the authentication logic from the client code.

public class LoginService {
    public User authenticate(String username, String password) {
        // Hardcoded credentials for simplicity
        if ("employee".equals(username) && "emppass".equals(password)) {
            return new Employee(username, password);
        } else if ("admin".equals(username) && "adpass".equals(password)) {
            return new Admin(username, password);
        } else if ("payroll".equals(username) && "paypass".equals(password)) {
            return new Payroll(username, password);
        }
        // Return null if no match found
        return null;
    }
}

//Encapsulation: The LoginService class encapsulates the logic for user authentication, keeping this detail hidden from the rest of the application.

//Abstraction: The method authenticate provides an abstract interface for user authentication, without exposing the implementation details.