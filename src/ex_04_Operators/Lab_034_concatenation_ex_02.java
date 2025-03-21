package ex_04_Operators;

public class Lab_034_concatenation_ex_02 {
    public static void main(String[] args) {
        String first_name = "Pushpa";
        String last_name = "Latha";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);  // o/p- pushpalatha1010
        // // Here first string is present then system will consider it as first operator and
        // perform string Concatenation

        System.out.println(a + b + first_name + last_name);// o/p- 20pushpalatha
        // // Here first int is present then system will consider first operator and
        // perform int Concatenation

        System.out.println(first_name + last_name + (a + b)); // o/p- pushpalatha20
        //BODMAS - Bracket of Div, mul, add, sub  - first solve inside brackets and then perform concatenation

    }
}
