import java.util.Scanner;

public class Q45CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        System.out.println("Number of digits in " + number + " = " + countDigit(number));
        sc.close();
    }

    static int countDigit(int n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }
}
