import java.util.Scanner;

public class Q69Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
