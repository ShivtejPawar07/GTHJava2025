/*Q34. There are a total n number of monkeys sitting on the branches of a huge tree. 
As travelers offer bananas and peanuts, the monkeys jump down the tree. If every 
Monkey can eat k Bananas and j Peanuts. If the total m number of Bananas and p 
number of Peanuts are offered by travelers, calculate how many Monkeys remain 
on the Tree after some of them jumped down to eat
At a time one Monkey gets down and finishes eating and goes to the other side of 
the road. The Monkey who climbed down does not climb up again after eating until 
the other Monkeys finish eating.
Monkeys can either eat k Bananas or j Peanuts. If for the last monkey there are 
less than k Bananas left on the ground or less than j Peanuts left on the ground, 
only that Monkey can eat Bananas(<j).
Write code to take inputs as n, m, p, k, j and return the number of Monkeys left
 on the Tree.

Where,
n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility 
of k and j having a value zero.
Example : Input Values 20  2  3  12  12
    Output Values Number of Monkeys left on the tree : 10         */
	
import java.util.Scanner;

public class MonkeyEating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter total number of monkeys (n): ");
        int n = sc.nextInt();//20

        System.out.print("Enter number of bananas a monkey eats (k): ");
        int k = sc.nextInt();//2

        System.out.print("Enter number of peanuts a monkey eats (j): ");
        int j = sc.nextInt();//3

        System.out.print("Enter total number of bananas (m): ");
        int m = sc.nextInt();//12

        System.out.print("Enter total number of peanuts (p): ");
        int p = sc.nextInt();//12

        // Monkeys that can eat full portions
        int bananaMonkeys = m / k;//12/2
        int peanutMonkeys = p / j;//12/2

        // Remaining bananas or peanuts after division
        int remainingBananas = m % k;
        int remainingPeanuts = p % j;

        // One extra monkey if leftovers available
        int extraMonkey = (remainingBananas > 0 || remainingPeanuts > 0) ? 1 : 0;

        // Total monkeys that got down
        int totalGotDown = bananaMonkeys + peanutMonkeys + extraMonkey;

        // Monkeys left on the tree
        int monkeysLeft = n - Math.min(totalGotDown, n);

        System.out.println("Number of Monkeys left on the tree: " + monkeysLeft);
    }
}
/*import java.util.*;
public class Monkey{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter total number of monkeys (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of bananas (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of peanuts (p): ");
        int p = sc.nextInt();

        System.out.print("Enter bananas eaten by one monkey (k): ");
        int k = sc.nextInt();

        System.out.print("Enter peanuts eaten by one monkey (j): ");
        int j = sc.nextInt();

        // Monkeys that can eat bananas
        int monkLeftBanana = m / k;//12/2=6

        // Monkeys that can eat peanuts
        int monkLeftPeanuts = p / j;//12/3=4

        int totalMonkeysJumped = monkLeftBanana + monkLeftPeanuts; //6+4=10
		
		// But monkeys cannot be more than total monkeys available
       /* if (totalMonkeysJumped > n) { //10>20
            totalMonkeysJumped = n;
        }*/

    //    int monkeysLeft = n - totalMonkeysJumped; //
      //  System.out.println("Number of Monkeys left on the tree : " + monkeysLeft); //10
  //  }
//}
