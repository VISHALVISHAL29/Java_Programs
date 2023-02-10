package com.company;
import java.util.Scanner;

public class Array_Questions {
         static int getMinMax(int j, int ...arr){
         // Scanner sc = new Scanner(System.in);
           //  int k= sc.nextInt();
             int N = 0;
             int []Arr;
             Arr = new int[N];
             for (int k=0;k<Arr.length;k++){
                 if  (Arr[k] == j){
                 return Arr[k];
                 }
             }
             return -1;
         }
    public static void main(String[] args) {
          // Scanner sc = new Scanner(System.in);
           int []Array =new int[6];
              Array[0]= 3;
              Array[1]= 2;
              Array[2]= 1;
              Array[3]= 56;
              Array[4]= 100000;
              Array[5]= 167;
              int i = 1;
           //       int i= sc.nextInt();
                  //System.out.printf("Array[%d]",i );
                 // System.out.print(" : ");
                  //System.out.print(Array[i]);
                     int result = getMinMax(i, Array);
                        System.out.println(result);

    }
}
