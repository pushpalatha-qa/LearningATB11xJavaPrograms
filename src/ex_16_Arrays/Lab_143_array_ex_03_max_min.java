package ex_16_Arrays;

public class Lab_143_array_ex_03_max_min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_output= max(array);
        int min_output= min(array);
        System.out.println(max_output);
        System.out.println(min_output);
    }


    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
            }
        }
        return min;

    }
}