/*Q2. Your Task: you have to create class name as MergeSort with constructor and methods. 
MergeSort(int a[],int b[]): this function is used for accept two array as parameter. 
int[] getMergedArray(): this function is used for return merged array. 
 
Input -First Array :- 1 2 3 4 5 
            Second Array :-  6 7 8 9 10  
            Output - 1 10 2 9 3 8 4 7 5 6 */
			
class MergeSort {
    int a[];
    int b[];
    int c[];

    // Constructor
    MergeSort(int a[], int b[]) {
        this.a = a;
        this.b = b;
        c = new int[a.length + b.length];
    }

    // Method to merge array
    int[] getMergedArray() {
        int i = 0;
        int j = b.length - 1;
        int k = 0;

        while (i < a.length && j >= 0) {
            c[k++] = a[i++];
            c[k++] = b[j--];
        }
        return c;
    }

    public static void main(String[] x) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        MergeSort mg = new MergeSort(a, b);
        int[] c = mg.getMergedArray();

        for (int val : c) {
            System.out.print(val + " ");
        }
    }
}
