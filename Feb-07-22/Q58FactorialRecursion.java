import java.util.*;

public class Q58FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        System.out.println("The Factorial of  " + number + " is " + Factorial(number));
        sc.close();
    }

    static int Factorial(int number) {
        if (number == 1)
            return 1;
        else
            return number * Factorial(number - 1);
    }
}
