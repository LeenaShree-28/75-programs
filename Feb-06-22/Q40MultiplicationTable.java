public class Q40MultiplicationTable {
    public static void main(String[] args) {
        int N = 2;
        System.out.println("Multiplication Table of " + N + " :");
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(i + " x " + N + " = " + result);
        }

    }
}
