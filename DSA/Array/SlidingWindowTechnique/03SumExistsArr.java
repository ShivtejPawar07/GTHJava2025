/* Q3 Check if Subarray with Given Sum Exists
   For a given sum, check if there’s a subarray with that sum using sliding window.
   Works only for non-negative numbers
*/
import java.util.*;
class SumSubArray{
    public static void main(String xx[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements:");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Enter target sum:");
        int x = sc.nextInt(); // target sum from user
        
        int j = 0;  // start pointer
        int sum = 0;
        boolean flag = false; // initially not found

        for(int i=0; i<n; i++){
            sum += a[i];  // expand window

            // shrink window while sum > x
            while(sum > x && j <= i){
                sum -= a[j];
                j++;
            }

            // print current window and sum
            System.out.print("Window: [ ");
            for(int k=j; k<=i; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println("]  Sum = " + sum);

            if(sum == x){
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println("Subarray with given sum exists!");
        else
            System.out.println("No subarray with given sum found!");
    }
}
