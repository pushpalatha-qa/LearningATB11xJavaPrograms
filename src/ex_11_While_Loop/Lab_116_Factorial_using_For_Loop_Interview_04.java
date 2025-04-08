package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_116_Factorial_using_For_Loop_Interview_04 {
    public static void main(String[] args) {
        //using scanner to get input
        //factorial program using for loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program \n Enter the number whose factorial you want");
        int number = scanner.nextInt();
        int factorial =1;
        if (number <=0){
            System.out.println("The factorial is" + factorial);
        }
        else{
            for(int i=1;i<= number;i++){
                factorial = factorial*i;

            }
        }
        System.out.println("The factorial is" + factorial);
    }
}
