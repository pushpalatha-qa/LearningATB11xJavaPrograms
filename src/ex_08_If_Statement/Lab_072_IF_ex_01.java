package ex_08_If_Statement;

public class Lab_072_IF_ex_01 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("Yes you can go to GOA!");
        } else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
