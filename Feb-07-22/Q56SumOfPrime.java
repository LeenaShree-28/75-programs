public class Q56SumOfPrime {
    public static void main(String[] args) {
        int num = 26;
        boolean flag = false;
        if (num % 2 != 0) {
            System.out.println(num + " can't express as sum of two prime numbers.");
        } else {
            for (int i = 1; i < num / 2; i += 2) {
                if (isPrime(i) == true) {
                    int prime1 = i;
                    int prime2 = num - i;
                    if (isPrime(prime2) == true) {
                        flag = true;
                        System.out.println(prime1 + " + " + prime2 + " = " + num + " and " + prime1 + ", " + prime2
                                + " are prime numbers.");
                    }
                }
            }
            if (flag == false) {
                System.out.println(num + " can't express as sum of two prime numbers.");
            }
        }
    }

    static boolean isPrime(int num) {
        int m = (int) Math.sqrt(num) + 1;
        boolean flag = false;
        if (num == 2)
            return true;
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    flag = true;
                    return false;
                }
            }
            if (flag == false) {
                return true;
            }
            return false;
        }
    }
}
