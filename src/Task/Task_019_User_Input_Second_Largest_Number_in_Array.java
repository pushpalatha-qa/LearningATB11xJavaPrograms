package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_019_User_Input_Second_Largest_Number_in_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int a[]= new int [size];
for (int i=0;i<a.length;i++){
    System.out.println("Enter array elements");
    a[i] = scanner.nextInt();
}
       // int[] a = {111, 122, 143, 146, 155, 160, 177, 418, 719, 1020};
        System.out.println("The length of array is " + a.length);
        System.out.println("--------------------------");
               int Largeno = 0;
        int Seclarge = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > Largeno) {
                Seclarge = Largeno;
                Largeno = a[i];
            } else if (a[i] > Seclarge && a[i] != Largeno) {
                Seclarge = a[i];
            }

        }
        System.out.println("The largest number is " + Largeno);
        System.out.println("The Second Largest number is " + Seclarge);
    }
}

//output--
// The length of array is 10
   //     --------------------------
//The largest number is 1020
//The Second Largest number is 719