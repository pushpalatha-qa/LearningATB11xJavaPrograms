package ex_16_Arrays;

import java.util.Arrays;

public class Lab_150_arrays_sort_string {
    public static void main(String[] args) {
        //find the 2nd highest number in given array using arrays.sort methodLab_150_arrays_sort_string
        int[] a = {85,34,66,55,44};
              Arrays.sort(a);
              for (int i: a)
              {
                  System.out.println("the ascending order of given arrays is " + i); //34,44,55,66,85
              }
        System.out.println("----------------");
                   System.out.println("first highest number is " + a[a.length-1]);
        System.out.println("Second highest number is " + a[a.length-2]);
                   }

    }
