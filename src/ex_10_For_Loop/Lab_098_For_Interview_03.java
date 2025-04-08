package ex_10_For_Loop;

public class Lab_098_For_Interview_03 {
    public static void main(String[] args) {
            for (long i = 1L; i < 10; i++) {
                System.out.println(i);
            }
            for (float f = 0.0f; f < 10.67; f++) {
                System.out.println("Hi,Float -> " + f);
            }

        }
}
//not advisable to use long and float in for loop, we mostly use integer and increment/decrement is done by 1 number