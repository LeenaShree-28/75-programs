import java.util.Scanner;

public class Q72Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = sc.nextInt();
        int i, j, k, m, n;
        for (i = 1; i <= rows; i++) {
            int num = 1;
            for (j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            n = i ;
            for (m = 1; m < i; m++) {
                System.out.print(--n + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
