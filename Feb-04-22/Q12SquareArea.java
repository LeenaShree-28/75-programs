package basic75programs;

import java.util.*;

public class Q12SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of square :");
        int sides = sc.nextInt();
        System.out.println("Area of Square : " + sides * sides + " sq.units.");
        sc.close();
    }
}
