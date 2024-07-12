package emailapp;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;

    private Scanner input = new Scanner(System.in);

    // Constructor to initialize first name, last name, and other email details
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

        this.department = setDepartment();

        // Call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        // Combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }

    // Method to generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    // Method to set department
    private String setDepartment() {
        System.out.println("Employee: " + firstname);
        System.out.println("Please select department code:");
        System.out.println("1. None");
        System.out.println("2. Sales");
        System.out.println("3. Development");
        System.out.println("4. Accounting");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                return "None";
            case 2:
                return "Sales";
            case 3:
                return "Development";
            case 4:
                return "Accounting";
            default:
                throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    // Method to show information
    public String showInfo() {
        return "Display Name: " + firstname + " " + lastname +
               "\nDepartment: " + department +
               "\nCompany Email: " + email +
               "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
