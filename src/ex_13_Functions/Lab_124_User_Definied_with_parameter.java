package ex_13_Functions;

public class Lab_124_User_Definied_with_parameter {
    public static void main(String[] args) {
        int r = sum_of_numbers(3, 4);
        int r2 = sum_of_numbers(13, 41);
        System.out.println(r);
        System.out.println(r2);
    }

    static int sum_of_numbers(int a, int b) {
        return a+b;
    }
}