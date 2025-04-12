package Task;

public class Task_012_FizzBuzz {
    //FizzBuzz Test:
//    Write a program that prints numbers from 1 to 100. However, for multiples of 3,
//    print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
//    For numbers that are multiples of both 3 and 5, print "FizzBuzz."
//   (for loop, if else) ( i%3==0) → 3 , i%5==0 → 5

   public static void main(String[]args)

   {
        String str ="fizz";
         String str1 ="buzz";
         String str2 ="fizzbuzz";
         for (int i=1;i<=100;i++){
                      if (i%3==0 && i%5==0){
                System.out.println(i + " this is multiples of 3 and 5 and print ---> " +  str2);
             }else if(i%3==0){
                System.out.println(i + " this is multiples of 3 and print ---> " + str );
            } else if (i%5==0) {
                System.out.println(i + " this is multiples of 5 and print ---> " +  str1 );
            }else{
               System.out.println(i);

            }
         }
    }
}
