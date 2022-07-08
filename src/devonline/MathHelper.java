package devonline;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        System.out.println("Enter cmd: {pi, e, exit or quit}");

        while(true) {
            while(true) {
                while(true) {
                    String userAnswer = (new Scanner(System.in)).nextLine();
                    if (!userAnswer.equals("pi")) {
                        if (!userAnswer.equals("e")) {
                            if (userAnswer.equals("exit") || userAnswer.equals("quit")) {
                                System.out.println("Bye");
                                return;
                            }

                            System.out.println("Invalid cmd. Try again! ");
                        } else {
                            System.out.println(Math.E);
                        }
                    } else {
                        System.out.println(Math.PI);
                    }
                }
            }
        }
    }}
