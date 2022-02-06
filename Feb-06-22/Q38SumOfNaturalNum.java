import java.util.*;

public class Q38SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        System.out.println("Sum of "+number+" Natural numbers is "+(number * (number + 1)) / 2);
        sc.close();
    }
}
