public class Q50Amstrong {
    public static void main(String[] args) {
        int num = 377;
        int total = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            total += digit * digit * digit;
            num /= 10;
        }
        if (total == temp)
            System.out.println(temp + " is Amstrong number.");
        else
            System.out.println(temp + " is not a Amstrong number.");
    }
}
