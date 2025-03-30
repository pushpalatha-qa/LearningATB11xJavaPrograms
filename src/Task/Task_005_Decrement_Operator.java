package Task;

public class Task_005_Decrement_Operator {
    public static void main(String[] args) {
                              int a = 20;
                System.out.println(--a + a++ + a--);
        System.out.println(a);
                //--a- decrement first and then assign/print the value ->19.  19(a value)
        //a++ -> assign and then increment -> a is 19, then increment -20 (latest a value)
        //a-- -> assign and then decrement -> a is 20, then decrement - 19
        //19+20+19  is 58
        // now latest a value is 19

            }
        }

