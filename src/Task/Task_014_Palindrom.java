package Task;

import java.util.Scanner;

public class Task_014_Palindrom {
    //task-21 march2025
    //Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the palindrome string");
        String userInput = scanner.nextLine().toLowerCase();
        String reverse  = "";
        System.out.println("Converted to lowercase----->" + userInput);
        for(int i=userInput.length()-1;i>=0;i--){
            reverse = reverse +( userInput.charAt(i));
        }
        if (userInput.equals(reverse)) {
            System.out.println("This is a Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}
