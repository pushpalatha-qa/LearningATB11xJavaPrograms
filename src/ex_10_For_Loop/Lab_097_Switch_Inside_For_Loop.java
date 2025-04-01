package ex_10_For_Loop;

public class Lab_097_Switch_Inside_For_Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
               case 7:
                   System.out.println("Sunday");
                   break;

                default:
                    System.out.println("Total no of days in a week is " + i);
            }
        }
    }
}