import java.util.*;

public class Q41Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for Fibonacci series :");
        int count = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Fibonacci Sequence :");
        System.out.print(n1 + " " + n2);
        int i = 2;
        while (i < count) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
        sc.close();
    }
}
