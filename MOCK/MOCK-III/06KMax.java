import java.util.*;

class KthHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {15, 8, 22, 4, 10, 18};
        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        // Sort array in descending order
        Arrays.sort(arr);
        
        // kth highest = element at length - k
        int kthHighest = arr[arr.length - k];
        
        System.out.println(k + "th highest value = " + kthHighest);
        
        sc.close();
    }
}