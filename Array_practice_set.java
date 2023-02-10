package com.company;

public class Array_practice_set {
    public int id;

    public static void main(String[] args) {
        //Question 1
       /* float []num;
        num= new float[5];
        num [0]=80;
        num [1]=70;
        num [2]=50;
        num [3]=60;
        num [4]=10;
        float sum;
        sum= 0f;
        for (int i=0;i<num.length;i++){
            sum = sum + num[i];

        }System.out.println(sum);   */
        //Question 2
        //QUESTION 3
        float []marks = {10,12,15,17,20,19};
        float SUM;
        SUM = 0;
        for (float element : marks){
                SUM = SUM + element;
        }
        System.out.println(SUM/ marks.length);





    }
}
