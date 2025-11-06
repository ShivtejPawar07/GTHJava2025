/*Q5. Write a java program to replace each element with its factorial.

Input: arr = [3, 4, 5]

Output: arr = [6, 24, 120]
*/
class FactArr{
	public static void main(String x[]){
		int a[]={3,4,5};
		findFact(a);
	}
	static void findFact(int[]a){
	    for(int i=0;i<a.length;i++){
			int fact=1;
			int n=a[i];
			for(int j=1;j<=n;j++){
				fact=fact*j;
			}
			System.out.print(fact+" ");
		}
		
	}
}