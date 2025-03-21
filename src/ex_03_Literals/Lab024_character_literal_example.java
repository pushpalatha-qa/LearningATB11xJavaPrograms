package ex_03_Literals;

public class Lab024_character_literal_example {
    public static void main(String[] args) {
        char letterA = 'A';
        char digit5 = '5';
        char specialChar = '@';
        char ch = 062;

        char newline = 'n';
        char tab = 't';
        char backslash = '\b';
        char carrier_return= '\r' ;  // carriage return moves the character to beginning of the line.
        char singleQuote = '\'';//  \'  inserts a single quote
        char unicodeChar = '\u03A9';
        System.out.println("octal value ch " + ch);
        System.out.println("Single Characters:");
        System.out.println("Letter A: " + letterA);
        System.out.println("Digit 5: " + digit5);
        System.out.println("Special Character: " + specialChar);

        System.out.println("nEscape Sequences:");
        System.out.println("Newline: " + newline);
        System.out.println("Tab: " + tab);
        System.out.println("Backslash: " + backslash);
        System.out.println("Single Quote: " + singleQuote);
        System.out.println("Unicode Character (Omega): " + unicodeChar);
    }


}
