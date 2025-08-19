import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Elemnet in Array");
		int n=sc.nextInt();
		
		int []a=new int [n];
	
		System.out.println("Enter array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display array");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		boolean flag = true;
        for (int i=0; i<n/2; i++) {
            if (a[i] != a[n-1-i]){//a[0]==a[4] a[1]==a[3]
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is Not Palindrome");
	}
}	