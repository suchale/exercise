package com.flexon.test;

public class Exe1 {
    public static void main(String[] args) {
        double var1=20;
        double var2=80;
        double sum = (var1 +var2)*25;
        System.out.println((int)sum);
        if(sum%40<=20)
            System.out.println("Total was over the limit");
    }
}
