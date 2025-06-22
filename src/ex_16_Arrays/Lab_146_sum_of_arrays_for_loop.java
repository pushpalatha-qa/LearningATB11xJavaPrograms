package ex_16_Arrays;

public class Lab_146_sum_of_arrays_for_loop {
    public static void main(String[] args) {
        //sum of arrays elements using for loop
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i=0; i<a.length; i++) {
            sum = sum + a[i];}

            System.out.println(sum);

       }
    }

