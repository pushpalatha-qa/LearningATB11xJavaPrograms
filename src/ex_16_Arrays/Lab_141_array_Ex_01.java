package ex_16_Arrays;

public class Lab_141_array_Ex_01 {
    public static void main(String[] args) {
        String[] names= {"jon","lucky","indra","rahul"};
        System.out.println(names.length); // gives the length of array
        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("----------------------");

        String[] atb11x_name = new String[3]; //here array size is fixed.
        atb11x_name[0]= "monu";
        atb11x_name[1]= "sonu";
        atb11x_name[2]= "bala";
        System.out.println(atb11x_name[0]);
        System.out.println(atb11x_name[1]);
        System.out.println(atb11x_name[2]);

        System.out.println("-------------------------");

        Boolean[] is_married = new Boolean[2];
      is_married[0]=true;
      is_married[1]=false;
        System.out.println(is_married[0]);
        System.out.println(is_married[1]);

    }
}
