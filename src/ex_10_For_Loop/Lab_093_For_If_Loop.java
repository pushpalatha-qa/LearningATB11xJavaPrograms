package ex_10_For_Loop;

public class Lab_093_For_If_Loop {
    public static void main(String[] args) {
        for (int sita = 0; sita < 18; sita++) { // 0 to 17, 18 times
            if (sita > 15) {
                System.out.println("Gift from Papa, IPhone");
            } else {
                System.out.println("No Gift");
            }
        }
    }
}