package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_118_Guessing_Game_Random_Number {
    public static void main(String[] args) {
        //using scanner to get input
        //Guess the random number using while loop and calculate the number of attempts.
        Random random = new Random();
        int guess_number = random.nextInt(100)+1;
        // here upperbound value is 100, so the random number will range
        // from 0 to 99 , to include 100, '+1' is added.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guessing Game \n Now Guess the number");
          int guess;
          int attempts =0;
          while (true){
              // for (;;)----> while (true) loop is replaced with a for(;;)
              //Using a for loop with no condition to simulate an infinite loop

              guess = scanner.nextInt();
              attempts++;
               if (guess<guess_number){
                      System.out.println("Too low, try another number");
                  } else if (guess>guess_number) {
                      System.out.println("Too high, try another number");
                  }else {
                      System.out.println("Gussed Right , Congratulations ! "  );
                   System.out.println( "Number of attempts " + attempts );
                   break;
                  }

              }
          }

    }

