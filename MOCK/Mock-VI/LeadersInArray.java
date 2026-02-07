/*Q5. Write a java program to find the “ Leaders ” in an array. - A leader in an array is an element which is larger than all the elements to its right side, 
which is what you can see in the above output. 
Input :- arr – { 15 , 18 , 5 , 7 , 9 , 2 } 
Output :- 2 , 9 , 18*/

class LeadersInArray {
    public static void main(String[] args) {

       // int[] arr = {15, 18, 5, 7, 9, 2};
        int[] arr = {15, 8, 10, 7, 3, 5};

        int max = arr[arr.length - 1];
        System.out.print(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(" , " + max);
            }
        }
    }
}
