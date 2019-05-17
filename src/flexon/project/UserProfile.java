package flexon.project;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserProfile {

    String lName;
    int phoneNos;
    String dOB;
    String emailAdd;
    String password;
    String cPassword;

    public void display(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name= scr.nextLine();
        System.out.println("Enter the  Last Name");
        String lname= scr.nextLine();
        System.out.println("Enter the Phone Number");
        long phoneNos= scr.nextLong();
        System.out.println("Enter the Date of Birth");
        int dob= scr.nextInt();
        scr.nextLine();
        System.out.println("Enter the EmailAdd");
        String email= scr.nextLine();
        System.out.println("Enter the Password");
        String pass= scr.nextLine();
        System.out.println("Enter the Confirm Password");
        String cPass= scr.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Last Name: "+lname);
        System.out.println("Phone Number: "+phoneNos);
        System.out.println("Date of Birth: "+dob);
        System.out.println("EmailAdd: "+email);
        System.out.println("Password: "+pass);
        System.out.println("Confirm Password: "+cPass);
    }

}
