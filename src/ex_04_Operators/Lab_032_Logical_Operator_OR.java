package ex_04_Operators;

public class Lab_032_Logical_Operator_OR {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false; // OR gate
         /* A | B | Z
             0 | 0| 0    0--False
             0 |1 | 1     1--True
              1 |0 |1
             1 |1 |1   */

        System.out.println(c);
    }
}
