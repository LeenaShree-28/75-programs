import java.util.*;

public class Q28AsciiChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char character = s.next().charAt(0);
        int ascii = (int) character;
        System.out.println("ASCII value is " + ascii);
        s.close();
    }
}
