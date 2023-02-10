package com.company;

public class CWH_33_VARARGS {
    /* int sum(int a ,int b){
     //return a+b;
      int x = a+b;
        return x;
    }
   //  int sum(int a ,int b,int c){
     //return a+b;
      int x = a+b+c;
        return x;
    }   int sum(int a ,int b,int c,int d){
     //return a+b;
      int x = a+b+c+d;
        return x;
    }*/
    static int sum(int ...arr){
        int x=0;
        for(int b: arr) {
            x += b;
        }
        return x;
    }
    public static void main(String[] args) {
 for (int i =0;i<args.length;i++){
     System.out.print(args[i]);
 }
       System.out.println("sum of 3 and 4  :" + sum(3,4));
       System.out.println("sum of 3 , 4 and5  :" + sum(3,4 ,5));
       System.out.println("sum of 3 , 4 , 5 and 7 :" + sum(3,4 ,5,7));
    }
}
