/*Q4. Write a java program to display following series using function recursion. 
            1  4  9  16  25  36  49  64  81  100*/
class Series{
	static void series(int i,int limit ){
		if(limit==0)
			return;
			System.out.print(i*i+" ");
		series(i+1,limit-1);
	}
	public static void main(String x[]){
		series(1,10);
	}
}