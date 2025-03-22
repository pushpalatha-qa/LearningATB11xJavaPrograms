package ex_05_Type_Casting;

public class Lab_051_Type_Casting_ex01 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit not allowed
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}