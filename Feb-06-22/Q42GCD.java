import java.util.*;

public class Q42GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = s.nextInt();
        System.out.println("Enter any number :");
        int b = s.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
        s.close();
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}
