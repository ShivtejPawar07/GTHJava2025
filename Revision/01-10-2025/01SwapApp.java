/*1. Write a program to input two values using command line argument and perform its swapping?*/
/*class Swap{
	public void swapping(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("Number After Swapping\n a=%d\tb=%d",a,b);
	}
}
class SwapApp{
	public static void main(String x[]){
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.printf("Number before Swapping\n a=%d\tb=%d",a,b);
	
		new Swap().swapping(a,b);
	}
}*/

class Swap2{
	public static void main(String[]x){
		int n=12345;
		int temp=n;
		int cnt=0;
		
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		
		int last2=n%100;
		int first2=n/(int)Math.pow(10,cnt-2);
		int middle=(n%(int)Math.pow(10,cnt-2))/100;
		
		int result=last2*(int)Math.pow(10,cnt-2)+middle*100+first2;
		
		System.out.println(last2+" "+middle+" "+first2);
		System.out.println(result);
		
		
	}
}
