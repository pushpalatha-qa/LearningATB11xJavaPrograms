package ex_04_Operators;

public class Lab_031_Relational_Operator {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // output will always be boolean

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_mother = 65;
        int age_father = 71;
        boolean result = age_mother >= age_father;
        System.out.println(result);
        boolean result1 = age_father!=age_mother;
        System.out.println("result1 is " + result1);
        boolean result2= age_mother == age_father;
        System.out.println("result2 is " + result2);
    }
}
