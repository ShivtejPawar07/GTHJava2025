/* Write a java program to Check If a Number Is a Neon Number or Not Neon number using 
function recursion.*/

class NeonRecApp{
	 static int sumOfDigit(int sq){
		if(sq==0)
			return 0;
		
		return (sq%10)+sumOfDigit(sq/10);
	}
	static void isNeon(int n){
		int sq=n*n;
		int sum=sumOfDigit(sq);
		
		if(n==sum)
			System.out.println("Number is neon");
		else
			System.out.println("Number is not neon");
	}
	public static void main(String[]x){
		int n=9;
		isNeon(n);
	}
}