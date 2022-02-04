package basic75programs;

public class Q17UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        int d = 11;
        boolean e = true;
        System.out.println("Unary Plus : " + (a+ + +a));
        System.out.println("Unary minus : " + (-a+ - --a));
        System.out.println("Post Increment Operator : " + (a++));
        System.out.println("Pre Increment Operator : " + (++b));
        System.out.println("Post Decrement Operator : " + (c--));
        System.out.println("Pre Decrement Operator : " + (--d));
        System.out.println("Logical Compement operator : " + (!e));
    }
}
