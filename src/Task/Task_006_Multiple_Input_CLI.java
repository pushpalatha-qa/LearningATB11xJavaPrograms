package Task;

public class Task_006_Multiple_Input_CLI {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        String name_string = args[0];
        String age_string = args[1];
       String salary_string =args[2];
        int age = Integer.parseInt(age_string);
        int salary = Integer.parseInt(salary_string);
        System.out.println("Name is " + name_string);
        System.out.println("Age is " + age);
        System.out.println("Salary is " + salary);
// input given in edit configuration->program arguments is
        //name-pushpa   |  age-25 | salary- 20000

        //output ->
        // pushpa
        //25
        //20000

    }
}
