package Task;

public class Task_020_Person_class_Object {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.isFemale();
        p1.person_details("pushpa", 25,20000,100);
        p1.person_name("Pushpalatha");
    }
}

class Person {
    String name;
    String color;
    int legs;
    int age;
    double salary;
    boolean isFemale;
    boolean isMarried;
    float height;
    double weight;
    int phone;


//1.without parameter without return
    void sleep() {
        System.out.println("This person is sleeping");
    }

    //2.without parameter with return
    boolean isFemale() {
        isFemale = true;
        System.out.println("Yes she is Female-----> " + isFemale);
        return isFemale;

    }
//3.with parameter without return
    void person_details(String name, int age, double salary, int phone) {
        System.out.println("name is" + name + "\nage is" + age + "\nsalary is " + salary + "\nyour phnumber is " + phone);
    }

    // 4.with parameter with return
    String person_name(String name) {
        System.out.println("Name is " + name);
        return name;
    }

}


//output
//Yes she is Female-----> true
//name ispushpa
//age is25
//salary is 20000.0
//your phnumber is 100
//Name is Pushpalatha