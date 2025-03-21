package ex_03_Literals;

public class Lab022_Integer_Literals {
    public static void main(String[] args) {
        int x=654;
        System.out.println("decimal literal value is " + x);//decimal system -base 10
        //binary literals
        int binary_num=0b1010;
        int binary_num1=0B1010;
        System.out.println("binary literal value is " + binary_num);
        System.out.println("binary literal value is " + binary_num1);
//octa literals
        int x1=0146;
        System.out.println("octal literal value is " + x1);

        //hexa literals
        int x2=0x123face;
        System.out.println("hexa literal value is " + x2);
    }
}
