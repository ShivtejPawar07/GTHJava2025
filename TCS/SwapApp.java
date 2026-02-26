
class  SwapApp{
	public static void main(String[]x){
		int a=10;
		int b=20;
		
		System.out.printf("a=%d\nb=%d\n",a,b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.printf("a=%d\nb=%d\n",a,b);
	
	}
}