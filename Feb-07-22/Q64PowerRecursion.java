import java.util.*;

public class Q64PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base Value :");
        int base = sc.nextInt();
        System.out.println("Enter power Value :");
        int power = sc.nextInt();
        System.out.println("Answer is " + Power(base, power));
        sc.close();
    }

    static int Power(int b, int p) {
        if (p == 1)
            return b;
        else
            return b * Power(b, p - 1);
    }
}
