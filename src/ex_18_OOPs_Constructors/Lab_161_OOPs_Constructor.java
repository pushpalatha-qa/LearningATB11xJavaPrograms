package ex_18_OOPs_Constructors;

public class Lab_161_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        b1.eat();
    }
}
class Baby{
    //attributes
    String name;

    //behaviour
    void eat(){
        System.out.println("baby eats");
    }
   void sleep(){
        System.out.println("Sleep");
   }
   void cry(){
    System.out.println("cry");
   }
    Baby(){
        System.out.println("This is default constructor");
    }
}

