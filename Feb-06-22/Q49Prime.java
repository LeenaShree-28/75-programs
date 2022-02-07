public class Q49Prime {
    public static void main(String[] args) {
        int num = 19;
        int m = (int) Math.sqrt(num) + 1;
        boolean flag = false;
        if (num == 2){
            System.out.println(num + " is prime number");
        }    
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(num + " is prime number");
            }
        }
    }
}
