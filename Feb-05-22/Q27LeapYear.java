package basic75programs;

import java.util.*;

public class Q27LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = s.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        s.close();
    }
}
