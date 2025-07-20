/*Q25.Write a java program to find the total number of notes in a given amount.  

                            

            Enter the amount: 2528

Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/
import java.util.*;

class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();

        int n500 = amount / 500;
        amount %= 500;

        int n100 = amount / 100;
        amount %= 100;

        int n50 = amount / 50;
        amount %= 50;

        int n20 = amount / 20;
        amount %= 20;

        int n10 = amount / 10;
        amount %= 10;

        int n5 = amount / 5;
        amount %= 5;

        int n2 = amount / 2;
        amount %= 2;

        int n1 = amount; // whatever remains is 1-rupee notes

        System.out.println("500 = " + n500);
        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("20 = " + n20);
        System.out.println("10 = " + n10);
        System.out.println("5 = " + n5);
        System.out.println("2 = " + n2);
        System.out.println("1 = " + n1);
    }
}
