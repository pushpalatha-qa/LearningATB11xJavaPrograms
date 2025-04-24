package Task;

import java.util.Scanner;

public class Task_013_Count_Vowels_consonents {
    //Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.nextLine().toLowerCase();
        System.out.println(name);
        int vowels = 0, consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

           // if (Character.isLetter(ch)) { // Only check letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    consonants++;


                }
            }
        System.out.println("number of vowels is " + vowels);
        System.out.println("number of consonents is " + consonants);
        }


    }


//output is --------//
//Enter the name
//PUSHPALATHA
//pushpalatha  ( converetd to lower case)
//number of vowels is 4
//number of consonents is 7