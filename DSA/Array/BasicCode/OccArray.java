import java.util.Scanner;

class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int arr[] = new int[n];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[n]; // To keep track of counted elements
        System.out.println("\nElement\t\tCount");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) 
				continue; // already counted
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }
            System.out.println(arr[i] + "\t\t" + count);
        }
    }
}
