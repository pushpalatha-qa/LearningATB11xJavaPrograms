package Task;

public class Task_002_Math {
    public static void main(String[] args) {
        int x=10,y=10,z=10;
        double CubeRootResult = Math.cbrt (Math.pow(x,2)+ Math.pow(y,2) - Math.abs(z));
        System.out.println("The cube root result is " + CubeRootResult);
    }
}
