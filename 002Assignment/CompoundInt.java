import java.util.*;
public class CompoundInt {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter principal amount = ");
        double p = sc.nextDouble();

        System.out.println("Enter rate = ");
        double r = sc.nextDouble();

        System.out.println("Enter number of years = ");
        int y = sc.nextInt();

        double amount = p * Math.pow((1 + r / 100), y);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Total Amount = " + amount);
    }
}
