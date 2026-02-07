import java.util.*;
class Demo{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0)
				System.out.print("Shivtej"+" ");
			else if(i%3==0)
				System.out.print("Dipak"+" ");
			else if(i%5==0)
				System.out.print("Pawar"+" ");
			else
				System.out.print(i+" ");
		}
	}
}