package ex_02_Java_Basic_Part2;

public class Lab015_consonants {
    public static void main(String[] args) {
        final int a = 10;
       // a = 12; //    a = 12; when you try to run error
        // will be shown-java: cannot assign a value to final variable a
        System.out.println(a);


        final float PI = 3.14f;
        //PI = 90; // we have used 'final' so value cannot be changed
        //error thrown-java: cannot assign a value to final variable PI
        System.out.println(PI);
    }
}
