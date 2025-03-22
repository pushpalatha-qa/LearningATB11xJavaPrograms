package ex_06_Ternary_Operator;

public class Lab_057_Ternary_operator_math_fuction {
    public static void main(String[] args) {
        //Find the maximum number between two numbers using ternary operator and math function.
        int x = 60;
        int y = 40;
        System.out.println(Math.max(x,y)); // Math.max() is used to find maximum of 2 numbers

        int max = x < y ? x : y;
        System.out.println(max);
    }
}
