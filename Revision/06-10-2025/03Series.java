/* Q3. Write a Java program to display the following series using function recursion : 7 10 15 22 31 42 55 70
*/
class Series{
	public static void main(String x[]){
		printSerirs(7,3,8);
	}
	static void printSerirs(int n,int diff,int cnt){
		if(cnt==0)
			return;
		System.out.print(n+" ");
		printSerirs(n+diff,diff+2,cnt--);
	
	}
}