package basic75programs;

public class Q24 {
    public static void main(String[] args) {
        int y = 10;
        int z = (++y * (y++ + 5));
        System.out.println(z);
    }
}