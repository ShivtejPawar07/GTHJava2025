/*Q3. Write a java program to swaps the first two digits with the last two digits, and prints the 
result.  
 Input : 12345  
 Output : 45312 */

class SwapDigits {
    public static void main(String[] args) {
	/*	int n = 12345;

        int last2 = n % 100;        // last two digits
        int first2 = n / 1000;      // first two digits
        int mid = (n / 100) % 10;   // middle digit

        int result = (last2 * 1000) + (mid * 100) + first2;

        System.out.println(result);
		*/
		
		int n=12345;
		int temp=n;
		int cnt=0;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		int last2=n%((int)Math.pow(10,2));
		int first2=(n/((int)Math.pow(10,cnt-2)));
		int middle=n/(int)Math.pow(10,2)
		
    }
}
