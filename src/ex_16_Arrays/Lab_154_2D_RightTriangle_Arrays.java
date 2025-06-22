package ex_16_Arrays;

import java.util.Scanner;

public class Lab_154_2D_RightTriangle_Arrays {
    public static void main(String[] args) {
        //get input from user and print the following format
        //if n=3,then print like this
        //  *
        //  **
        /// ***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scanner.nextInt();

        for (int i = 0; i <n ; i++) {
       for (int j = 0; j <=i ; j++) {
               System.out.print(" * ");

                          }
            System.out.println("");
      }
        }
    }
