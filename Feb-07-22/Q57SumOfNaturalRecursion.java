import java.util.Scanner;

public class Q57SumOfNaturalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        System.out.println("Sum of Natural Number " + number + " is " + SumOfNatural(number));
        sc.close();
    }

    static int SumOfNatural(int number) {
        if (number == 0)
            return 0;
        else
            return number + SumOfNatural(number - 1);
    }
}
