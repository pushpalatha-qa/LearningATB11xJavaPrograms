package ex_16_Arrays;

public class Lab_142_array_ex_02_using_for_loop {
    public static void main(String[] args) {
        int[] marks= {58,75,88,95,100};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------------");

        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
