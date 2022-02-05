import java.io.*;

public class Q36PositiveOrNegative {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any number : ");
        int number = Integer.parseInt(br.readLine());
        if(number>=0) System.out.println(number+" is Positive.");
        else System.out.println(number+" is Negative.");
    }
}
