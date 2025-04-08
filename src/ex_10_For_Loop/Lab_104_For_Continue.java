package ex_10_For_Loop;

public class Lab_104_For_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                continue;
                // Continue keyword- skips the particular condition and move to top
                //to execute the remaining program.
                //here when i reaches 5 , only this particular condition is skipped and remaining program is
                //executed .
            }
            System.out.println(i);
        }
    }
}
// output is
// 0 to 4 - printed
// 5 is skipped
//6 to 49 is printed .