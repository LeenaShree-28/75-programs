import java.util.Scanner;

public class Q55PrimeOrArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = s.nextInt();
        if (checkPrimeNumber(number) == true)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
        if (checkArmstrongNumber(number) == true)
            System.out.println(number + " is an armstrong number");
        else
            System.out.println(number + " is not an armstrong number");
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
                    break;
                }
            }
            if (flag == false) {
                return true;
            }
            return false;
        }
    }

    static boolean checkArmstrongNumber(int num) {
        int total = 0;
        int temp = num;
        int count = countDigit(num);
        while (num != 0) {
            int digit = num % 10;
            total += Math.pow(digit, count);
            num /= 10;
        }
        if (total == temp)
            return true;
        return false;
    }

    static int countDigit(int n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }
}
