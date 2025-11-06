import java.util.*;
class FApp{
	public static void main(String[] x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a Number");
		int n=sc.nextInt();
		
		int[] freq=new int[10];
		
		while(n!=0){
			int rem=n%10;
			freq[rem]++;
			n/=10;
		}
		for(int i=0;i<=9;i++){
			if(freq[i]>0)
				System.out.println("Eelemnt="+i+"count="+freq[i]);
		}
	}
}