package com.flexon.test;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.String;
public class Exe2 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the word");
        char fruit=scr.next().charAt(0);
        switch (fruit){
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case'C':
                System.out.println("Cherries");
                break;
            case 'D':
                System.out.println("Dragon Fruit");
                break;
                default:
                    System.out.println("Not in fruit basket");
        }
    }
}
