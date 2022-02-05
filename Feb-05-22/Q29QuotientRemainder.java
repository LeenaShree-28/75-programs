package basic75programs;

import java.util.*;

public class Q29QuotientRemainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter dividend :");
        int dividend = s.nextInt();
        System.out.println("Enter divisor :");
        int divisor = s.nextInt();
        if(divisor == 0){
            System.out.println("0 is invalid. Enter any other number.");
            divisor = s.nextInt();
        }
        System.out.println("Quotient : " + dividend / divisor);
        System.out.println("Remainder : " + dividend % divisor);
        s.close();
    }
}
