package ex_07_Increment_Decrement_Operator;

public class Lab_066_Advance_ID_ex_04 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A -> a++ -> ExpA -> 10, a = 11
        // +
        // B -> a -> ExpB -> 11 , a = 11
        // A+B ->  ExpA + ExpB -> 10+11

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 11 | 10+11 -> 21
    }
}
