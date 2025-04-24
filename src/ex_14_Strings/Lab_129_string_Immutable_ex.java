package ex_14_Strings;

public class Lab_129_string_Immutable_ex {
    public static void main(String[] args) {
        //string creation 2 ways
        String name = "pushpa"; // stored in SCP
        String name1 = new String ("pushpa");// stored in object area
       System.out.println( name);
        System.out.println( name1);

// concatination of strings
        String s1 = "hello";
        s1 = s1.concat("world"); // concat add the values , merge the values
        System.out.println(s1);

    }
    }
