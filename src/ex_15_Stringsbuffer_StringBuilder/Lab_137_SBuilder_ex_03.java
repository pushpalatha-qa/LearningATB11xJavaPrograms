package ex_15_Stringsbuffer_StringBuilder;

public class Lab_137_SBuilder_ex_03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
