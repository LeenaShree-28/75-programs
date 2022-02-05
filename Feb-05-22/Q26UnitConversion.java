import java.util.*;

public class Q26UnitConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // km to miles
        System.out.println("Please enter Kilometers : ");
        int km = s.nextInt();
        float miles = km / 1.6f;
        System.out.println(miles + " Miles");
        // celsius to fahrenheit
        System.out.println("Please enter Celsius : ");
        float celsius = s.nextFloat();
        float fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        // sqft to acre
        System.out.println("Please enter squarefeet : ");
        float sqft = s.nextFloat();
        System.out.printf("sqft to acre : %.7f", sqft / (float) 43560);
        s.close();
    }
}
