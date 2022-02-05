import java.util.*;

public class Q13RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle's sides :");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle's sides :");
        int width = sc.nextInt();
        System.out.println("Area of Rectangle : " + length * width + " sq.units");
        sc.close();
    }
}
