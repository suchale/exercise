package com.flexon.test;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter 1 for Multiplication , 2 for Division, 3 for addition, 4 for subtraction");
        int option = scr.nextInt();

        if (option > 4 || option < 1)
            System.out.println("Invalid Input");
        else {
            System.out.println("Enter 1st number");
            num1 = scr.nextInt();
            System.out.println("Enter 2nd number");
            num2 = scr.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Multiplication =" + (num1 * num2));
                    break;
                case 2:
                    System.out.println("Division =" + (num1 / num2));
                    break;
                case 3:
                    System.out.println("Addition =" + (num1 + num2));
                    break;
                case 4:
                    System.out.println("Subtraction =" + (num1 - num2));
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
