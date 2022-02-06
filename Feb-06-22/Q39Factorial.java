import java.util.*;

public class Q39Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        System.out.println("The Factorial of " + num + " is " + result);
        sc.close();
    }
}
