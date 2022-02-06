import java.util.Scanner;

public class Q53Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter operand 1 : ");
        int a = s.nextInt();
        System.out.println("Enter any operator from the following : + - * / ");
        char operator = s.next().charAt(0);
        System.out.println("Enter operand 2 : ");
        int b = s.nextInt();
        switch(operator){
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + ((double)a / (double)b));
                break;
            default:
                System.out.println("Invalid Operator.");
            
        }
        s.close();
    }
}
