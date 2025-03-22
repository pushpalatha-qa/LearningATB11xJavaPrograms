package ex_06_Ternary_Operator;

public class Lab_059_Nested_TO_maxof3num {
    public static void main(String[] args) {
        int n1= 9;
        int n2= 11;
        int n3= -15;
       String  max = (n1>n2) ? (n1>n3)? "n1 greater" : "n3 is greater":
        ((n2>n3) ? "n2 is greater" : "n3 is greater than n2");
        System.out.println(max);


    }
}
