package ex_05_Type_Casting;

public class Lab_049_Type_Casting_01 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid - > Implicit Casting- Automatically
        int a1 = (int) b; // Explicit widening Casting - to be done manually ( doesn't require)
    }
}
