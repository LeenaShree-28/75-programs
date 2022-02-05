package basic75programs;

public class Q21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(++a - b--);
        a = 4;
        b = 8;
        System.out.println(a % b++);
        a = 10;
        b = 3;
        System.out.println(a *= b + 5);
        int x = 69 >>> 2;
        System.out.println(x);
    }
}