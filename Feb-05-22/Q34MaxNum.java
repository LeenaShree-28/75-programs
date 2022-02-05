package basic75programs;

public class Q34MaxNum {
    public static void main(String[] args) {
        int x = 44;
        int y = 100;
        int z = 73;
        if (x > y && x > z) {
            System.out.println("The Largest number is : " + x);
        } else if (y > z) {
            System.out.println("The Largest number is : " + y);
        } else {
            System.out.println("The Largest number is : " + z);
        }
    }
}
