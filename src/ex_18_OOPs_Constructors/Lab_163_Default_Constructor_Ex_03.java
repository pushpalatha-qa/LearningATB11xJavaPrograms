package ex_18_OOPs_Constructors;

public class Lab_163_Default_Constructor_Ex_03 {
    public static void main(String[] args) {
        Car c1= new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println("-----------------------");

        Car c2= new Car();
        c2.name="Maruthi";
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

    }
}
class Car{
String name;
String model;
int year;
  //Default Constructor
     Car(){
      name= "unknown";
      model= "XXXX";
      year= 1991;
  }

}

