package Task;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_009_Even_Odd_User_Input_Scanner_Class {
    public static void main(String[] args) {
        //Create a Program - Take user input & Check weather the input is even or odd number using if condition
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter num");
        int num= scanner.nextInt();
              System.out.println("The number input from console is " + num);

        if (num % 2 == 0) {
            System.out.println("The number is even");

        }
        else {
            System.out.println("The number is odd");

                        //-----Input from console-----
            // Enter num
            //60

            //---output-----
            //The number input from console is 60
            //The number is even
        }
    }

}
