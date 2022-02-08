public class Q62BinaryToOctal {
    public static void main(String[] args) {
        int binary = 101010;
        int decimal = binaryToDecimal(binary);
        int octal = decimalToOctal(decimal);
        System.out.println("Octal value of " + binary + " is " + octal);
    }

    static int binaryToDecimal(int binary) {
        int decimal = 0;
        int p = 0;
        while (binary != 0) {
            int lastNum = binary % 10;
            decimal += (int) lastNum * (Math.pow(2, p));
            p++;
            binary /= 10;
        }
        return decimal;
    }

    static int decimalToOctal(int decimal) {
        int octal = 0;
        int p = 0;
        while (decimal != 0) {
            int remainder = decimal % 8;
            octal += (int) remainder * (Math.pow(10, p));
            p++;
            decimal /= 8;
        }
        return octal;
    }
}
