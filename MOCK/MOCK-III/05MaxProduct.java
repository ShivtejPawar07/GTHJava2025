/*Q5. Write a java program to find the maximum product of two integers in a given array of 
integers.    
Example: 
Input :  
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output:  
Pair is (7, 8), Maximum Product: 56 */

class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};

        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0, num2 = 0;

        // Check product of every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = nums[i];
                    num2 = nums[j];
                }
            }
        }

        System.out.println("Pair is (" + num1 + ", " + num2 + "), Maximum Product: " + maxProduct);
    }
}
