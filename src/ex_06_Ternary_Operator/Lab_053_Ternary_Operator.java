package ex_06_Ternary_Operator;

public class Lab_053_Ternary_Operator {
    public static void main(String[] args) {
        //sytax- condition ? expression 1 if true: expression 2 if false
        int age = 10;
        String canIVote = 10 >= 18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote);
    }
}