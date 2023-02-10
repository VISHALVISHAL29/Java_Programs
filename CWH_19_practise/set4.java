package com.company.CWH_19_practise;

import javax.swing.*;
import java.util.Scanner;

public class set4 {
    public static void main(String[] args){
        /* int a = 10;
        if (a == 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("i am not 11");
        }*/
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Chemistry : ");
        int a = sc.nextInt();
        if (a > 100){
            System.out.println("Error");
        }
        else if ( a < 33) {
            System.out.println("you are fail in Chemistry");
        }
        System.out.println("");
        System.out.print("Mathematics : ");
        int b = sc.nextInt();
        if (b > 100){
            System.out.println("Error");
        }
        else if (b<33){
            System.out.println("You are fail in Mathematics");
        }
        System.out.println("");
        System.out.print("Physics : ");
        int c = sc.nextInt();
        if (c > 100){
            System.out.println("Error");
        }
        else if (c<33){
            System.out.println("You are fail in Physics");
        }
        System.out.println("");
        float sum = a+b+c;
        float percentage = (sum/300)*100;
        System.out.println("Percentage obtained by the candidate : "+percentage+"%");
        if (percentage < 40 ) {
            System.out.println("You have failed the exam.");
        }
        else {
            System.out.println("Congratulation you have passed the exam.");
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Annual Salary : ");
         float a = sc.nextInt();
         switch ((int) a){
             case 250000 :
                 float salary = (5.0f/100) *(a);
                 System.out.println(salary);


         }

    }
}
