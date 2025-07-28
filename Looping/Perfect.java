import java.util.*;
class Perfect{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Num");
	int n=sc.nextInt();
	int i=1,sum=0;
	while(i<n){//1<6
	  if(n%i==0){//6%1==0
	   sum+=i;//0+1
	  }
	  i++;
	}
	String msg= n==sum?"Perfect":"Not Perfect";
	System.out.println(msg);
  }
}