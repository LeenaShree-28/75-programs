public class Q61OctalToDecimal {
    public static void main(String[] args) {
        int octal = 400;
        int decimal = 0;
        int p = 0;
        int temp = octal;
        while (octal != 0) {
            int lastNum = octal % 10;
            decimal += (int) lastNum * (Math.pow(8, p));
            p++;
            octal /= 10;
        }
        System.out.println("Decimal value of " + temp + " is " + decimal);
    }
}
