package Task;

public class Task_004_Increment_operator {
    public static void main(String[] args) {
                  int a = 10;

            System.out.println(++a + a++ + a++);
            System.out.println(a);

            //++a-> first increase and assign/print the value->11 , here a is 11
            //a++-> assign/print the value and then increase -> 11, here incremented value is 12 (this is a value latest)
            // a++->assign/print the value and then increase ->12, incremented value is 13.
        // Now Latest a value is 13.
        }
    }



