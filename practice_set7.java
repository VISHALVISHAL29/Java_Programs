package com.company;

public class practice_set7 {
    static void multiplication(int n){
        for(int i=0;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
       if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fibonacci(int n){
        if (n==1||n==2){
            return (n-1);
        }
        return fibonacci(n-1) +fibonacci(n-2);
    }
    public static void main(String[] args) {
    /*multiplication(10);
        pattern1(10);*/
       /* int c = sumRec(100);
        System.out.println(c);*/
        pattern2(5);
        int d = fibonacci(3);
        System.out.println(d);
    }
}
