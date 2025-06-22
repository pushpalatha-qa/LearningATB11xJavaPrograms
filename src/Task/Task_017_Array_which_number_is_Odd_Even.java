package Task;

public class Task_017_Array_which_number_is_Odd_Even {

    public static void main(String[] args) {
                int [] a={11,12,13,14,15,16,17,18,19,20};
        int even = 0, odd=0;
        System.out.println("The length of array is " + a.length);
        System.out.println("--------------------------");
        System.out.println("Even number in array");
                for(int i=0;i<a.length;i++) {
                   if (a[i] % 2 == 0) {
                        System.out.println(a[i]);
                    }
                }
        System.out.println("odd number in array");
                for(int i=0;i<a.length;i++) {
                      if (a[i]%2!=0)
                        System.out.println(a[i]);
                    }

                }
    }

//output--
//The length of array is 10
//--------------------------
//Even number in array
//12
//14
//16
//18
//20
//odd number in array
//11
//13
//15
//17
//19