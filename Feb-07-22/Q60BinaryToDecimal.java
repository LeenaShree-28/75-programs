public class Q60BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 110011;
        int decimal = 0;
        int p = 0;
        int temp = binary;
        while (binary != 0) {
            int lastNum = binary % 10;
            decimal += (int) lastNum * (Math.pow(2, p));
            p++;
            binary /= 10;
        }
        System.out.println("Decimal value of " + temp + " is " + decimal);
    }
}
