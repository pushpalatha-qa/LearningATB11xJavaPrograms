package Task;

import java.util.Scanner;

public class Task_011_Fibonacci_Series {
    //task date-20/03/2025- using for loop
    //Fibonacci series-Each number is found by adding the **previous two numbers** in the sequence:
    // Example of the Sequence: 0,1,1,2,3,5,8,13,21,34,55,89,…
    // 0+1=1 , 1+1=2 , 1+2=3 , 2+3=5 , 3+5=8......
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scanner.nextInt();
        System.out.println("Fibonacci Series");
        //first two numbers in the Fibonacci sequence are 0 and 1. So, we initialize a as 0 and b as 1.
        int a=0,b=1;
        int sum;
        System.out.println(a);
        for(int i=0; i<n; i++){
                     sum = a+b;
            a=b;
            b=sum;

            System.out.println(sum);
        }

    }

}