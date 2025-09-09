/*Magic Number 
19=1+9=10=1+0=1 */
import java.util.Scanner;
class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isMagic(n))
            System.out.println(n + " is a Magic Number");
        else
            System.out.println(n + " is NOT a Magic Number");
    }
    // Function to check magic number
    public static boolean isMagic(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n=sum;
        }
        return n == 1;
    }
}
