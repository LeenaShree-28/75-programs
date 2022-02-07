import java.util.Scanner;

public class Q54PrimeBetweenIntervals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the ending number : ");
        int num2 = s.nextInt();
        System.out.println("Prime numbers between " + num1 + " and " + num2 + " : ");
        for (int num = num1; num <= num2; num++) {
            if (checkPrimeNumber(num) == true)
                System.out.println(num);
        }
        s.close();
    }

    static boolean checkPrimeNumber(int num) {
        int m = (int) Math.sqrt(num) + 1;
        boolean flag = false;
        if (num == 2)
            return true;
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    flag = true;
                    return false;
                }
            }
            if (flag == false) {
                return true;
            }
            return false;
        }
    }
}
