package ex_06_Ternary_Operator;

public class Lab_056_Nested_Ternary_example {
    public static void main(String[] args) {
        //  to find the largest amount 3 numbers

        int n1= 20;
        int n2=40;
        int n3=60;

     //ternary operator- comparing two numbers
      String Result_ternary_operator = n1  >n2 ? "Yes, n1 is greater" : "No n2 is  greater";
        System.out.println(Result_ternary_operator);
        String Result_ternary_operator2 = n2 < n3 ? "Yes, n3 is greater" : "No n2 is  smaller";
        System.out.println(Result_ternary_operator2);

        //nested ternary to compare all 3 numbers
        //condition? ((condition 2? expression1:expression2)) :expression 3;
        String nested_result = (n1> n2) ? ((n2>n3 ? "yes 2 greater" : "no n3 is greater")):"n1 is smallest of all";
        System.out.println(nested_result);
    }
}
