package com.company.CWH_19_practise;
import java.util.ArrayList;

public class main {
    public static int common_element(int[] v1, int[] v2) {
        //Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0;j<v1.length;j++){
            for(int i=0;i<v2.length;i++){
                //double unity = v1[j]/v2[i];
                if (v1[j]==v2[i]){
                    //int a =(int)v1[i];

                    return v1[j];
                }
            }

        }
        return 0;
    }

   /* static void getInput () {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //Taking the number of testcases
        while(t-->0)
        {
            int a = sc.nextInt() ;
            String s = sc.nextLine();

            //Your code here

            System.out.println(a);
            System.out.println(s);
        }

    }


       // static String toLower(String S) {
            //converting uppercase to lowercase using inbuilt function toLowerCase()
           // S ="ABCddE";
          //  String Converted_S = S.toLowerCase();
           // System.out.println(S.toLowerCase());
           // String A = "ABCddE";
         //   String Converted_S = S.toLowerCase();
            // System.out.println(A.toLowerCase());
            //returning converted string
         //   return Converted_S;
    //}*/
    public static void main(String[] args) {
       // System.out.println("hello world");
       /* String A = "ABCddE";
        System.out.println(A.toLowerCase());*/
     //   String A = "ABCddE";//

//String a = toLower("ABCddE");
    //System.out.println(a);
      //int b = getInput( 2);
     /*  String a = "wl" ,str ="";
        char ab;
        for (int j=0; j<a.length(); j++){
            ab = a.charAt(j);
           str = ab+str;
        }
        System.out.println(str);
        String name = "Vishal";
       // StringBuilder revesred_name = new StringBuilder();
       // revesred_name.append(name);
         name.reverse();
        System.out.println(name);*/
        int []a1 = {3,4,2,2,4};
        int []a2 = {3,2,2,7};
        int el = common_element(a1,a2);
        System.out.println(el);
    }
  }