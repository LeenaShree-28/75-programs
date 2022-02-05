package basic75programs;

public class Q31SwapNum {
    public static void main(String[] args) {
        int a = 22;
        int b = 17;
        int s;
        System.out.println("Before Swaping two numbers");
        System.out.println("a : " + a + " b : " + b);
        s = a;
        a = b;
        b = s;
        System.out.println("After Swaping two numbers");
        System.out.println("a : " + a + " b : " + b);
    }
}
