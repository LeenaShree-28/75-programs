import java.util.*;

public class Q14CylinderArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder :");
        int radius = sc.nextInt();
        System.out.println("Enter the height of cylinder :");
        int height = sc.nextInt();
        float ans = 2 * (3.142f) * radius * (height + radius);
        System.out.println("Area of cylinder : " + ans + " sq.units");
        sc.close();
    }
}
