import java.util.*;

public class Pyramids {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = s.nextInt();
        System.out.println("Diamond Pattern");
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = (rows - i) * 2 - 1; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hourglass Pattern");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (rows - i) * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}