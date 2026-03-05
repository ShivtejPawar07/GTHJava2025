/*Q7.Write a java program to store N integers in a HashMap. Find all Armstrong numbers. 
Input: 
6 
153 10 370 89 407 25 
Output: 
Armstrong Numbers: 153 370 407 
Description: 
Store the given integers in a HashMap where the key is the index and the value is the number. 
Traverse the Map values one by one. 
For each number: 
• Extract digits manually using % 10 and / 10. 
• Do not use Math.pow().*/

import java.util.*;

class CollArmApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();

        System.out.println("Enter number of integers:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            hm.put(i, sc.nextInt());
        }

        System.out.println("Original HashMap: " + hm);

        System.out.print("Armstrong Numbers: ");
        for (int val : hm.values()) {
            if (isArmstrong(val)) {
                System.out.print(val + " ");
            }
        }
        sc.close();
    }

    // Check if a number is Armstrong without Math.pow()
    static boolean isArmstrong(int num) {
        int count = countOfDigits(num);
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) { // digit^count manually
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        return sum == num;
    }

    // Count digits recursively
    static int countOfDigits(int n) {
        if (n == 0) return 0;
        return 1 + countOfDigits(n / 10);
    }
}