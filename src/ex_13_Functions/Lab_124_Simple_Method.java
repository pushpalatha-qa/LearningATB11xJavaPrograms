package ex_13_Functions;

public class Lab_124_Simple_Method {
    static void pramod_f1() {
        System.out.println("No Return");
    }

    static int return_int() {
        return 10;
    }
    static boolean return_boolean(){
        return true;

    }

    static float return_float_pi_value(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10L;
    }

    static String return_String(){
        return "Pramod";
    }
    public static void main(String[] args) {
        // call
        pramod_f1();
       //int result7 = pramod_f1();->will not return any value
        int result1 = return_int();
        System.out.println("Returning int--->" + result1);

         boolean result2 = return_boolean();
        System.out.println("Returning boolean--->" + result2);

        float result3 = return_float_pi_value();
        System.out.println("Returning float--->" + result3);

        byte result4 =return_byte();
        System.out.println("Returning byte--->" + result4);

        long result5 = return_long();
        System.out.println("Returning long--->" + result5);

        String result6 = return_String();
        System.out.println("Returning string--->" + result6);

    }

}