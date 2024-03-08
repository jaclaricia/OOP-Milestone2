package Payroll;

//This is the base class for users. It implements encapsulation by keeping fields private and providing public getters and setters.

public abstract class User {
    private String username;
    private String password;

    // Constructor, getters and setters
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Abstract method to show options based on user role
    public abstract void showOptions();
}