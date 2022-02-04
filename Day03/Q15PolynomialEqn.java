package basic75programs;

import java.util.*;

public class Q15PolynomialEqn {
    public static void main(String[] args) {
        // System.out.println(Math.sqrt(12));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();
        int x1 = (-b) + (int) Math.sqrt(b * b - (4 * a * c)) / 2 * a;
        int x2 = (-b) - (int) Math.sqrt(b * b - (4 * a * c)) / 2 * a;
        System.out.println("value of x : " + x1 + " , " + x2);
        sc.close();

    }
}
