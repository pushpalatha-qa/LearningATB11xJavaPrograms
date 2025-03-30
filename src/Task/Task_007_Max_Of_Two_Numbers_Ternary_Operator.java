package Task;

public class Task_007_Max_Of_Two_Numbers_Ternary_Operator {
  //  Take a user input 2 numbers from the arguments(CLI Inputs) and
    //  calculate the maximum in between with ternary operator.
  public static void main(String[] args) {
      String n1 = args[0];
      String n2 = args[1];
      System.out.println(n1);
      System.out.println(n2);
      int num1 = Integer.parseInt(n1);
      int num2 = Integer.parseInt(n2);
      String maxof2numbers = num1 >num2 ? "num1 is maximum" : "num2 is maximum";
      System.out.println(maxof2numbers);
  }

}
