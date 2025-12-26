package Task;

import com.sun.security.jgss.GSSUtil;

public class Task_021_PC_DC_conctructoroverloading_Person{
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        System.out.println("--------------This is Default constructor--------------");
        System.out.println(p1.name);
        System.out.println(p1.isFemale);

        Person1 p2 = new Person1("Harish","Vizag",568564787,false);
        System.out.println("----------This is parameterized constructor------------");
        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.Phoneno);
        System.out.println(p2.isFemale);

        Person1 p3 = new Person1("sheela",true);
        System.out.println("-----------this is constructor overloading");
        System.out.println(p3.name);
        System.out.println(p3.isFemale);

        p1.eat();

        p2.sleep();

        p3.walk();

        p3.dohome();
        System.out.println("----------------------------");

        p1.printdetails();

        System.out.println("----------------------------");
        p3.printdetails();
    }
}

class Person1 {
    String name;
    String address;
    long Phoneno;
    boolean isFemale;


    Person1(){
        name="pushpa";
        address="hyd";
        Phoneno=725237;
        isFemale= true;
        System.out.println("This is default constructor");
    }

    Person1(String name, String address, long Phoneno, Boolean isFemale){
       this.name =name;
       this.address=address;
      this.Phoneno=Phoneno;
      this.isFemale=isFemale;
    }

    Person1(String name,Boolean isFemale){
        this.name=name;
        this.isFemale=isFemale;
    }
    void eat(){
        System.out.println(this.name + " Iam eating ");
    }
    void sleep(){
        System.out.println(this.address + " Iam sleeping ");
    }
    void walk(){
        System.out.println(this.Phoneno + " Iam walking ");
    }
    void dohome(){
        System.out.println(this.isFemale + " Doing homework ");
    }
    void printdetails(){
        System.out.println("name  " + this.name);
        System.out.println("Address  " + this.address);
        System.out.println("phoneno  " + this.Phoneno);
        System.out.println("isFemale  " + this.isFemale);

    }
}



