package ex_16_Arrays;

public class Lab_147_sum_of_arrays_for_each_loop {
    public static void main(String[] args) {
        //sum of arrays elements using for loop
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int n : a) {
            sum = sum +n;
                   }
        System.out.println(sum);
    }
}