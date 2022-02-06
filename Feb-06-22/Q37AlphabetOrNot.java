import java.util.*;

public class Q37AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character :");
        char character =sc.next().charAt(0);
        int ascii = (int)character;
        if (ascii <= 90 && ascii >= 65 || ascii <= 122 && ascii >= 97) {
            System.out.println(character + " is alphabet");
        }else{
            System.out.println(character + " is not alphabet");
        }
        sc.close();
    }
}
