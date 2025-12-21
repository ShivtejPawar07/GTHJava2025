/* Q2. Write a java program to display following series using function recursion : 
            2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1  */
			
class Series{
	public static void main(String[]x){
		series(2,9);
	}
	static void series(int a,int b){
		if(b==0)
			return;
		System.out.print(a+" "+b*b*b+" ");
		series(a+2,b-1);
		
	}
}