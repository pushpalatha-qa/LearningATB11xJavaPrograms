package ex_07_Increment_Decrement_Operator;

public class Lab_062_Increment_Decrement_ex {

    public static void main(String[] args) {


        int a = 10;
        int b = ++a; // increment first and then assign, so 10+1=11 -> now  b is-> 11 & new a value is 11
        System.out.println(b); // 11
        System.out.println(a); // 11


        //  Exp and Result Table
        // Line No | a | Result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)
    }
}