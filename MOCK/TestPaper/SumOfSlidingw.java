/*Q.1 Write a Java program to find the sum of every K-sized window in a given array and print  
those window sums which are divisible by a given number.Use the sliding window 
technique.
Input :Array = {2, 7, 6, 1, 4, 5} 
K = 3 
Divisor = 3 
Windows: 
{2, 7, 6} → Sum = 15 (Divisible by 3) 
{7, 6, 1} → Sum = 14 (Not divisible by 3) 
{6, 1, 4} → Sum = 11 (Not divisible by 3) 
{1, 4, 5} → Sum = 10 (Not divisible by 3)
*/
class SumOfSlidingw{
	public static void main(String[]x){
		int[]a={2,7,6,1,4,5};
		int k=3;
		int  sum=0,divisor = 3 ;
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		if(sum%divisor==0)
			System.out.println("Divisible by "+divisor);
		else
			System.out.println("Not Divisible by "+divisor);
		
		for(int i=k;i<a.length;i++){
			sum=sum+a[i]-a[i-k];
			System.out.println(sum);
			if(sum%divisor==0)
			System.out.println("Divisible by "+divisor);
		else
			System.out.println("Not Divisible by "+divisor);
		}
		
	}
}