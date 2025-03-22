package ex_06_Ternary_Operator;

public class LAb_055_Nested_Ternary_InterviewQuestion {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //not used because it makes code very complex

        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20"):"B";
        System.out.println(result);

    }
}
