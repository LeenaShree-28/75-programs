public class Q50Armstrong {
    public static void main(String[] args) {
        int num = 371;
        int total = 0;
        int temp = num;
        int count = countDigit(num);
        while (num != 0) {
            int digit = num % 10;
            total += Math.pow(digit, count);
            num /= 10;
        }
        if (total == temp)
            System.out.println(temp + " is Amstrong number.");
        else
            System.out.println(temp + " is not a Amstrong number.");
    }

    static int countDigit(int n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }
}
