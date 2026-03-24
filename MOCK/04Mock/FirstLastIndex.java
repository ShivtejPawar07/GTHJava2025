/*Q6.Given a sorted array (may contain duplicates), find the first and last index of a given number x 
using binary search. Example: arr = [2, 4, 4, 4, 6, 7, 9], x = 4 Output: First = 1, Last = 3
*/
class FirstLastIndex {

    // Find first occurrence
    static int firstIndex(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        int index = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == x) {
                index = mid;     // store possible answer
                r = mid - 1;     // search left side
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    // Find last occurrence
    static int lastIndex(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        int index = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == x) {
                index = mid;     // store possible answer
                l = mid + 1;     // search right side
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 9};
        int x = 4;

        int first = firstIndex(arr, x);
        int last = lastIndex(arr, x);

        System.out.println("First = " + first);
        System.out.println("Last  = " + last);
    }
}
