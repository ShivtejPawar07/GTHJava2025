public class Rev {
    public static void main(String[] x) {
        int n = Integer.parseInt(x[0]);
        int revn = 0;

        int d1 = n % 10; // last digit=123%10=3
        n = n / 10;//123/10=12

        int d2 = n % 10; // middle digit=12%10=2
        n = n / 10;//12/10=1

        int d3 = n; // first digit

        revn = (d1 * 100) + (d2 * 10) + d3;

        System.out.println("Reverse => " + revn);
    }
}
