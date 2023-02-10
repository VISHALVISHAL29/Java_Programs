package com.company;
public class CWH_31_methods {
    static float logic (float x, float y){
        float z;
        if (x>y){
            z=x+y;
        }
        else{
            z = (x+y)*5;

        }return z;
    }
    public static void main(String[] args) {
      //  float a = 5;
        //float b =7;*/
        float c = logic(5,7);
        System.out.println(c);
        // float i = 3;
        //float o = 1;*/
        float k = logic(6,5);
        System.out.println(k);

    }

}
