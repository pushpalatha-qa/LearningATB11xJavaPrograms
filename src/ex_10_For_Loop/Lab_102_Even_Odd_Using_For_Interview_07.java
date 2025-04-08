package ex_10_For_Loop;

public class Lab_102_Even_Odd_Using_For_Interview_07 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // output will print from  0 to 10, - 11 times
            if (i % 2 == 0) {
                System.out.println(" The number is Even ----> " + i);
            } else {
                System.out.println(" The number is odd------> " + i);
            }
        }
    }

}