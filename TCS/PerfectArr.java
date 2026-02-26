/*Q20. Write a java program to find perfect number of a array.*/

class PerfectArr{
	public static void main(String[]x){
		int[]a={1,6,28,34,45};
		//6=1+2+3;
		for(int i=0;i<a.length;i++){
			int n=a[i];
			int sum=0;
			for(int j=1;j<=n/2;j++){
				if(n%j==0){
					sum+=j;
				}
				if(sum==n)
					System.out.print(a[i]+" ");
			}
		}
	}
}