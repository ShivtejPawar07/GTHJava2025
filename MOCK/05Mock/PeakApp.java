/*Q2. A peak element is greater than or equal to its neighbors. Given an array, find the index of any one 
peak element using binary search. 
Example: Input: arr = [1,3,20,4,1,0] → Output: 2 (20 is a peak).*/

class PeakApp {
    public static void main(String[] x) {

        int[] a = {1, 3, 20, 4, 1, 0};

        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (a[mid] < a[mid + 1]) {
                low = mid + 1;
            } 
			else {
                high = mid;
            }
        }

        System.out.println("Peak element index: " + low);
        System.out.println("Peak element value: " + a[low]);
    }
}
