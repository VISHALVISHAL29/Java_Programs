package com.company;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers of days : ");
        int a = sc.nextInt();
        int b = (a/365);
        System.out.print("Years : ");
        System.out.println(b);
        int c = a%365;
        int d = c/7;
        System.out.print("Weeks : ");
        System.out.println(d);

    }
}
