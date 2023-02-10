package com.company;
class Employee{
   private int id;
   private String name;
   public int getId(){

       return id;
   }

}
public class Access_Modifiers {
  public static void main(String []args){
     Employee cred = new Employee();
           //  cred.id = 45;
           //  cred.name="VIshal";
      System.out.println(cred.getId());
     // System.out.println(cred.name);

  }
}
