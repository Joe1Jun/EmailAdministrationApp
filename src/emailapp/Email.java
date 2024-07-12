package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength;
	private String alernateEmail;
	private Scanner input = new Scanner (System.in);
	
	
	public Email(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("EMAIL CREATED : " + this.firstname + " " + this.lastname);
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
	}

	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#%";
		char [] password = new char [length];
		
		for( int i = 0 ; i < length ; i++) {
			
			int rand = (int)Math.random()*passwordSet.length();
			password [i] = passwordSet.charAt(rand);
		}
		
		return new String (password);
	}

	

	


	public String getDepartment() {
		return department;
	}

	public String setDepartment() {
       
        System.out.println("0. For none ");
        System.out.println("1. Sales");
        System.out.println("2. Development");
        System.out.println("3. Accounting");
        System.out.println("Enter Department Code");
        

         
       
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
