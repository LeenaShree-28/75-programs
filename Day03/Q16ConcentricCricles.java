package basic75programs;

import java.util.*;

public class Q16ConcentricCricles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of inner circle:");
        int radius1 = sc.nextInt();
        System.out.println("Enter the radius of outer circle :");
        int radius2 = sc.nextInt();
        float area1 = (3.142f) * radius1 * radius1;
        float area2 = (3.142f) * radius2 * radius2;
        System.out.println("Area of the space between the circles : " + (area2 - area1) + " sq.units");
        sc.close();
    }
}
