package ex_16_Arrays;

import java.util.Scanner;

public class Lab_155_2D_LeftTriangle_Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size_of_table= scanner.nextInt();

        for (int i =0; i<size_of_table ; i++) {
       for (int j = 0; j <size_of_table ; j++) {
          // System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");
           System.out.print((i * j) + "\t");
                          }
            System.out.println();
      }
        }
    }
//output
//Enter the size=3
 //       0	0	0
 //       0	1	2
 //       0	2	4