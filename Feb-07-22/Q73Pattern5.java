import java.util.Scanner;

public class Q73Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = sc.nextInt();
        int i, k, m, n;
        for (i = 1; i <= rows; i++) {
            for (k = 1; k <= rows; k++) {
                if (k > rows - i) {
                    System.out.print(k + " ");
                } else {
                    System.out.print("  ");
                }
            }
            n = k - 1;
            for (m = 1; m < i; m++) {
                System.out.print(--n + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
