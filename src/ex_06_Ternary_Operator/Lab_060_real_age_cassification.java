package ex_06_Ternary_Operator;

public class Lab_060_real_age_cassification {
    public static void main(String[] args) {
        //case 1- take input from user using CLI in intellij
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);
        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
