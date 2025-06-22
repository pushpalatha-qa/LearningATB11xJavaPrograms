package ex_16_Arrays;

import java.util.Scanner;

public class Lab_144_array_userinput {
    public static void main(String[] args) {
        //get the marks of student in array and print it
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array elements Int only");
        int array_size = sc.nextInt();
        System.out.println("The size of array is " + array_size);
        int[] marks = new int[array_size];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks");
          marks[i] = sc.nextInt();
       }

        System.out.println("--------------");
           for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
          }



        sc.close();
    }





    }
