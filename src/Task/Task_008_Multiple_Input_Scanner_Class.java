package Task;

import java.util.Scanner;

public class Task_008_Multiple_Input_Scanner_Class {
    public static void main(String[] args) {
        //Take a user input using scanner class - Name, Age and Salary and print them in the end.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.nextLine();

        System.out.println(" enter your age");
       int age = scanner.nextInt();

        System.out.println(" enter your salary");
        double salary = scanner.nextDouble();

        System.out.println(" User Information");
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Salary is " + salary);

        scanner.close();


        // ------input given in console-----
        /*enter your name
           latha
        enter your age
        30
        enter your salary
        7000000
// ------output ---------
        User Information
                Name is latha
        Age is 30
        Salary is 7000000.0    */
    }
}
