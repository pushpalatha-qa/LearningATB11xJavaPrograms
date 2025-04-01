package ex_10_For_Loop;

public class Lab_092_For_Loop_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }
        // output is infinite loop, because condition is NOT given.
        // exit code 130 (click Red Button in console to Stop by Yourself- Kill to interrupted by signal
        // exit code 0 - Successful execution of program
    }
}
