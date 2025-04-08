package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_117_Factorial_using_While_Loop_Interview_05 {
    public static void main(String[] args) {
        //using scanner to get input
        //factorial program using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program \n Enter the number whose factorial you want");
        int number = scanner.nextInt();
        int factorial =1;

        if (number <=0){
            System.out.println("The factorial is" + factorial);
        }
        else{
            int i=1;
               while (i <= number){
                   factorial = factorial*i;
                   i++;

                }
                        }
        System.out.println("The factorial is " + factorial);
        }

    }

