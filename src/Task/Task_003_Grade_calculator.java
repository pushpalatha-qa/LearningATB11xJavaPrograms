package Task;

public class Task_003_Grade_calculator {

    public static void main(String[] args) {
        /* Write a program that calculates and displays the letter
    grade for a given numerical score (e.g., A, B, C, D, or F)
    based on the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59 */
        String grade1 = args[0];
        System.out.println(grade1);

        int G= Integer.parseInt(grade1);

        String result = ( G>=90 && G<=100 )? "A" :
                (G >=80 && G <=89)? "B" :
                        (G >=70 && G <=79)? "C" :
                                (G>=60 && G<=69)? "D"
                                        : (G>=0 &&G <=59)? "F": "Fail not promoted";
        System.out.println(result);
    }


    }



