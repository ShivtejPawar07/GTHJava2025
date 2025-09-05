/*10Sliding Window Maximum (Optional Advanced)
Return the maximum in every window of size k (can be skipped or bonus).*/
class MaxInWindow{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;


        // Slide the window across the array
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i]; // assume first element in window is max
            for (int j = i; j < i + k; j++) { // check window of size k
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
