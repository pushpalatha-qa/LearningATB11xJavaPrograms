package ex_03_Literals;

public class Lab_025_character_literal_example2 {
    public static void main(String[] args) {
        char letter = 'b';
        char digit  = '6';
        char spl_symbol = '%';
        char spl_symbol1 = '^';
        char new_line = '\n';
        char tab_line  = '\t';
        char carriage_return = '\r';
        char ch =062;
        char c10 = 'A';         //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
        System.out.println("this is my first line" + new_line +"this is my second line\n this is my third line");
        System.out.println("letter is " + letter);
        System.out.println("digit  is " + digit);
        System.out.println("spl_symbol   is " + spl_symbol );
        System.out.println("spl_symbol1   is " + spl_symbol1 );
        System.out.println("Pramod is old"+carriage_return+"Dutta");
        System.out.println("octal value is " + ch);


    }
}
