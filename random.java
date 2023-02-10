package com.company;
import java.util.Scanner;
import java.util.Random;
    public class random {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int player1 = 0;
            int computer = 0;
            for (computer = 0; computer <= 5; computer++) {
                System.out.print("Enter your response :  ");
                int x = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your response :  ");
                String b = sc.nextLine();
                int a = rand.nextInt(3);


                switch (b) {

                    case "rock":
                        if (a == 0) {
                            System.out.print("System response : ");
                            System.out.println("rock\ndraw");
                        } else if (a == 1) {
                            System.out.print("System response : ");
                            System.out.println("scissor\nyou win");
                        } else {
                            System.out.print("System response : ");
                            System.out.println("paper\nyou lose");
                        }
                        break;

                    case "paper":
                        if (a == 0) {
                            System.out.print("System response : ");
                            System.out.println("rock\nyou win ");
                        } else if (a == 1) {
                            System.out.print("System response : ");
                            System.out.println("scissor\ndraw ");
                        } else {
                            System.out.print("System response : ");
                            System.out.println("paper\nDraw ");
                        }
                        break;
                    case "scissor":
                        if (a == 0) {
                            System.out.print("System response :");
                            System.out.println("rock\nyou lose");
                        } else if (a == 1) {
                            System.out.print("System response :");
                            System.out.println("scissor\ndraw");

                        } else {
                            System.out.print("System response : ");
                            System.out.print("paper\nyou win");
                        }


                }


            }
        }

    }