import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		boolean p=false;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				p=true;
			}
			
		}
		if(p){
			System.out.println("yes");
			
		}
		else
			System.out.println("No");
		
	}
	
} 