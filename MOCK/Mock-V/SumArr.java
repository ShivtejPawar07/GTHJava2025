/*Q4. Write a java program to take input array from user and perform this operations in array. 
Input Array :  5732  8659  2534  9625  7354  1325 
Explanation : Store sum of digits at same index. 
Output :-  17  28  14  22  19  11*/

class SumArr{
	public static void main(String[]x){
		int[]a={5732,8659,2534,9625,7354,1325};
		
		for(int i=0;i<a.length;i++){
			int n=a[i];
			int sum=0;
			while(n!=0){
				int rem=n%10;
				sum+=rem;
				n=n/10;
			}
			System.out.print(sum+" ");
		}
	}
}