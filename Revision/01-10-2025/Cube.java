class Cube {
    // Search method returns index of value, or -1 if not found
    static int search(int a[], int s) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int skey = 5;

        int index = Cube.search(a, skey); // call search
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + index);
        }
    }
}
