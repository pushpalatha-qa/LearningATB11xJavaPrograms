package Task;

import java.util.Scanner;

public class Task_010_Triangle_Classifier_IF_Else_Statement {
    public static void main(String[] args) {
        //✅ Triangle Classifier:
        //
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter side1 of triangle");
        int side1 = scanner.nextInt();

        System.out.println("Enter side2 of triangle");
        int side2 = scanner.nextInt();

        System.out.println("Enter side3 of triangle");
        int side3= scanner.nextInt();

        if (side1==side2 && side2==side3){
            System.out.println("The triangle is equilateral ");
        } else if (side1==side2 || side2==side3||side1==side3) {
            System.out.println("The triangle is isosceles  ");
        }else{
            System.out.println("The triangle is scalene  ");

            //-----output will look like -----
            //Enter side1 of triangle
            //10
            //Enter side2 of triangle
            //10
            //Enter side3 of triangle
            //5
            //The triangle is isosceles
        }
    }
}
