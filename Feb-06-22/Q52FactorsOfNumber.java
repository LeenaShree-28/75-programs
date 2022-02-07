import java.util.Scanner;

public class Q52FactorsOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = s.nextInt();
        System.out.println("Factors of " + number + " : \n1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
        System.out.println(number);
        s.close();
    }
}
