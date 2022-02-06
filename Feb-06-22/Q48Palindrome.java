public class Q48Palindrome {
    public static void main(String[] args) {
        int num = 545, reversed = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        if (reversed == temp) {
            System.out.println(temp + " is Palindrome.");
        } else {
            System.out.println(temp + " is not a Palindrome.");
        }
    }
}
