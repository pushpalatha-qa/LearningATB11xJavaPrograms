package ex_18_OOPs_Constructors;

public class Lab_164_PArameterized_Constructor {
    public static void main(String[] args) {
        vehicle_car car = new vehicle_car();
        System.out.println(car.name); //DC
        vehicle_car c1 = new vehicle_car("Maruthi","Suzuki", 1988);
        System.out.println(c1.year);//PC
    }
}
    class vehicle_car {
        String name;
        String model;
        int year;
//This is default constructor
        vehicle_car() {
            name = "unknown";
            model = "ABCCCCC";
            year = 1998;
            System.out.println("This is default constructor");
        }

        //this is parameterized constructor
            vehicle_car(String name, String model, int year){
                this.name = name;
                this.model = model;
                this.year = year;

            }
        }
