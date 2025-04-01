package ex_09_Switch;

import java.util.Scanner;

public class Lab_077_switch_without_default {
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



// ---- Without default, no code will be executed if input is outside the case.and it will come out of loop
                // and the output will look like---
       //    Enter the day num(1 to 7)
                //7

        }
    }

}