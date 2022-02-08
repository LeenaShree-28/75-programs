public class Q60BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 110011L;
        System.out.println("Decimal value of " + binary + "(binary) is " + toDecimal(binary, 2));
    }

    static int toDecimal(long number, int base) {
        int decimal = 0;
        int p = 0;
        while (number != 0) {
            int lastNum = (int) number % 10;
            decimal += lastNum * ((int) Math.pow(base, p));
            p++;
            number /= 10;
        }
        return decimal;
    }
}
