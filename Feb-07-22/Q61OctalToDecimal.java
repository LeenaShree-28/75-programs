public class Q61OctalToDecimal {
    public static void main(String[] args) {
        int octal = 400;
        System.out.println("Decimal value of " + octal + "(octal) is " + toDecimal(octal, 8));
    }

    static int toDecimal(int number, int base) {
        int decimal = 0;
        int p = 0;
        while (number != 0) {
            int lastNum = number % 10;
            decimal += lastNum * ((int) Math.pow(base, p));
            p++;
            number /= 10;
        }
        return decimal;
    }
}
