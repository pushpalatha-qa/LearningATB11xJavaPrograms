package ex_05_Type_Casting;

public class Lab_050_Type_Casting_Narrowing {
    public static void main(String[] args) {
        int val  = 300;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte)val; // Valid - Explicit Narrowing is allowed
        // Data Loss.
        System.out.println(b2);
    }
}
