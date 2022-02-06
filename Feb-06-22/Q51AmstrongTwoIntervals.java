import java.util.Scanner;

public class Q51AmstrongTwoIntervals{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the ending number : ");
        int num2 = s.nextInt();
        System.out.println("Amstrong Numbers between " + num1 + " and " + num2 + " : ");
        for(int i=num1;i<=num2;i++){
            int temp = i;
            int total = 0;
            int count = countDigit(i);
            while (temp != 0) {
                int digit = temp % 10;
                total += Math.pow(digit, count);
                temp /= 10;
            }
            if(total==i) System.out.println(i);
        }
        s.close();
    }

    static int countDigit(int n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }
}