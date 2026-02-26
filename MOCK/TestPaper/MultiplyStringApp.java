/*10)  Multiply Strings 
Multiply two non-negative numbers represented as strings without converting to integers. 
Example 
Input: "123", "456" → "56088"*/

class MultiplyStringApp {
    public static void main(String[] args) {

        String num1 = "12";
        String num2 = "12";

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int position1 = i + j;
                int position2 = i + j + 1;

                int sum = product + result[position2];

                result[position2] = sum % 10;
                result[position1] += sum / 10;
            }
        }

        // Convert array to string
        StringBuilder sb = new StringBuilder();

        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        if (sb.length() == 0) {
            System.out.println("0");
        } else {
            System.out.println(sb.toString());
        }
    }
}
