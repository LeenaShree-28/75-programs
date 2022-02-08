public class Q62BinaryToOctal {
    public static void main(String[] args) {
        long binary = 101010L;
        int decimal = ToDecimal(binary, 2);
        int octal = fromDecimal(decimal, 8);
        System.out.println("Octal value of " + binary + "(binary) is " + octal);
    }

    static int ToDecimal(long binary, int base) {
        int decimal = 0;
        int p = 0;
        while (binary != 0) {
            int lastNum = (int) binary % 10;
            decimal += lastNum * ((int) Math.pow(base, p));
            p++;
            binary /= 10;
        }
        return decimal;
    }

    static int fromDecimal(int decimal, int base) {
        int octal = 0;
        int p = 0;
        while (decimal != 0) {
            int remainder = decimal % base;
            octal += remainder * ((int) Math.pow(10, p));
            p++;
            decimal /= base;
        }
        return octal;
    }
}
