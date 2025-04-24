package Task;

import java.util.Scanner;

public class Task_015_StringBuffer_Functions {

    public static void main(String[] args) {
        //1. creation of string buffer
        StringBuffer sb = new StringBuffer("HELLO");
        System.out.println(sb); // output-HELLO
        //2.length()
        System.out.println(sb.length());//output-5
        //3.append ()
        System.out.println(sb.append(" World"));//output- HELLO WORLD
        //4.insert(int index,String s): Inserts text at a given position
        System.out.println(sb.insert(11," -Iam Learning Java")); //output- HELLO World -Iam Learning Java
        //5.replace(int start, int end, String s): Replaces a substring
        System.out.println(sb.replace(11,15," xyz")); //output-HELLO World xyzm Learning Java
        //6.delete(int start, int end): Deletes a substring
        System.out.println(sb.delete(26,30));//output-HELLO World xyzm Learning
        //7.reverse(): Reverses the string
        System.out.println(sb.reverse());//output-gninraeL mzyx dlroW OLLEH
        //8.capacity(): Returns the capacity of the buffer
        System.out.println(sb.capacity()); //output-44
        //9.ensureCapacity(int minCapacity): Ensures a minimum capacity
        sb.ensureCapacity(45);
        System.out.println(sb.capacity());//output-90
        //10.charAt(int index): Returns a character at a specified index
        System.out.println(sb.charAt(19)); //output-W
        //11.setCharAt(int index, char ch): Changes a character at a position
        sb.setCharAt(21,'k');
        System.out.println(sb); //output-gninraeL mzyx dlroW kLLEH
        //12.substring(int start): Extracts a substring
        StringBuffer sb1 = new StringBuffer("Hello World");
        System.out.println(sb1.substring(6)); // Output: World
        //13.substring(int start, int end): Extracts a substring within a range
        StringBuffer sb2 = new StringBuffer("Programming Language");
        System.out.println(sb2.substring(6,11));//output-mming
        //14.toString(): Converts StringBuffer to String
        StringBuffer sb3 = new StringBuffer("Programming Language");
        System.out.println(sb3.toString());//output-Programming Language

    }
            }

