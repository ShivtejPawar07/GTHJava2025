/*Q2. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd 
elements is equal. 
 Input :- arr = [1, 2, 3, 4, 5, 6] 
 Output :-  [2, 1, 4, 3, 6, 5] */

class EvenOddAlternate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        int[] result = new int[arr.length];

        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        // Print result
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}