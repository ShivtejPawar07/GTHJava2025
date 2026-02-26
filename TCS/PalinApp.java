/*palindrome*/

class PalinApp{
	static void isPalin(int n){
		int temp=n;
		int rev=0;
		while(temp!=0){
				rev=(rev*10)+temp%10;
				temp/=10;
		}
			if(n==rev)
				System.out.println("Palin");
			else
			    System.out.println("Not Palin");
		
	
	}
	public static void main(String[]x){
		int n=12321;
		isPalin(n);
	}
	

}