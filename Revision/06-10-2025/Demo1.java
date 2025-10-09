class MaxLen {
    public static void main(String[] args) {
        int n = 7;   // first term
        int diff = 3; // initial difference
        
        for(int i = 0; i < 8; i++) { // 8 terms
            System.out.print(n + " ");
            n = n + diff;
            diff = diff + 2; // increase difference by 2 each time
        }
    }
}
/*class MaxLen {
    public static void main(String[] args) {
        printSequence(7, 3, 8); // start=7, diff=3, 8 terms
    }

    // Recursive function
    static void printSequence(int n, int diff, int count) {
        if(count == 0) return; // base case: stop when count is 0
        System.out.print(n + " ");
        printSequence(n + diff, diff + 2, count - 1); // next term
    }
}
*/
