package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alernateEmail;
	private Scanner input = new Scanner (System.in);
	
	
	public Email(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.department = setDepartment();
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
		
	}


	public String getDepartment() {
		return department;
	}

	public String setDepartment() {
        System.out.println("Enter department");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");

         
       
         int choice = input.nextInt(); // Read the integer input
       
        

        switch (choice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }


	public String getAlernateEmail() {
		return alernateEmail;
	}


	public void setAlernateEmail(String alernateEmail) {
		this.alernateEmail = alernateEmail;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}
	
	
	
	
	
	
}
