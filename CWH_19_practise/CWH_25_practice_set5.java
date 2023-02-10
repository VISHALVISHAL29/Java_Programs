package com.company.CWH_19_practise;

public class CWH_25_practice_set5 {
    public static void main(String[] args) {
//Question1
        int n = 4;
        for (int w =4; 0 < w; w--) {
            for (int j = 0; j <= w-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Question2
        int sum = 0;
        int a = 0;
        while (a<4) {
            sum = sum + 2 * n;
            n++;
        }
        System.out.println("sum of even no. is ");
        System.out.print(sum);
        int Sum = 0;
        int b = 4;
        for (int I = 0; I < b; I++) {
            Sum = Sum + (2 * I);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

        //Question 3
        int i = 0;
        int x = 2;
        do {
            int f = 2 * i;
            System.out.printf("%d x %d = %d\n", x, i, f);
            i++;
        } while (i <= 10);


        int p = 5;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for (int q = 1; q <= 10; q++) {
            System.out.printf("%d X %d = %d\n", n, q, n * q);

            //Question 4
            int d = 10;
            for (int l = 10; l >= 0; l--) {
                int c = 10 * l;
                System.out.printf("%d x %d = %d\n", d, l, c);
            }
            //Question 6
            int k = 10;
            while (k <= 10 && k >= 0) {
                k--;
                System.out.println("5");
            }
            //Question 5
            int v = 5;
            int z = 1;
            for (int F = 1; F <= v; F++) {
                z = z * F;
            }
            System.out.println(z);
            int V = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120
            int C = 1;
            int factorial = 1;
            while (C <= V) {
                factorial *= C;
                C++;
            }
            System.out.println(factorial);
            //Question 7
       for (int G = 5; G > 0; G++) {
                System.out.println("1");
            }
            int G = 4;
            while (G > 0) {
                G++;
                System.out.println("1");
            }
            //Question 9
            int B = 0;
            for (int A = 1; A <= 12; A++) {
                B = B + 8 * A;
                // b = b + c;
            }
            System.out.println(b);

        }
    }
}