package ex_13_Functions;

public class Lab_125_User_Definied_4_Typess {
    public static void main(String[] args) {
        // 1.without parameter without return type
        wop_wort();
        // 2.without parameter with return type
    String r = wop_wr();
        System.out.println(r);
        //3. with parameter without return type (mostly used)
        wp_wort("pushpa", 20,100 );
        wp_wort("latha", 40,130 );
        //4 with parameter with return type
        int sum = sum_of_two_numbers(60,100);
        int sum1 = sum_of_three_numbers(40,80,200);
        System.out.println(sum);
        System.out.println(sum1);

    }



         // 1.without parameter without return type
    static void wop_wort(){
        System.out.println("Hi, I am without parameter without return type");

               }
    // 2.without parameter with return type
    static String wop_wr(){
        System.out.println("-------------------------------------");
        return "hi, am withoutparamter but with return";
    }
    //3. with parameter without return type (mostly used)
    static void wp_wort(String name , int age, double salary) {
        System.out.println("---------with parameter without return----------------------------");
        System.out.println("your name --->" + name + "\nYour age--->" + age + "\nyour salary--->" + salary);
    }
        static void greet_with_full_name(String firstname, String lastname) {
            System.out.println("------------------------------------");
        System.out.println("Hi, Your name is " + firstname + lastname);
        }
     //4.with parameter with return type
     static int sum_of_two_numbers(int a, int b){
         System.out.println("------------with parameter with return-------------------------");
         return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }
}