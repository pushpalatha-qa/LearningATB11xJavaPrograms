package ex_09_Switch;

import java.util.Scanner;

public class Lab_076_switch_without_Break {
    public static void main(String[] args) {

// input using scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thur");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("Invalid, day number");


// ---- Without break, all the statements are executed
                // and the output will look likw---
       //    Enter the day num(1 to 7)
                //6
                //Sat
                //Sun
                //Invalid, day number

        }
    }

}