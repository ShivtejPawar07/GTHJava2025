/*Q4. Write a java program to find the frequency of each digit in a given integer using function 
recursion.*/
class DigitFrequency {

    static int[] freq = new int[10];  // to store frequency of digits

    // recursive function
    static void countDigits(int n) {
        if (n == 0)
            return;

        int digit = n % 10;
        freq[digit]++;

        countDigits(n / 10);  // recursive call
    }

    public static void main(String[] args) {
        int num = 1223345;
		
        countDigits(num);  // call recursive function

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " → " + freq[i]);
        }
    }
}
