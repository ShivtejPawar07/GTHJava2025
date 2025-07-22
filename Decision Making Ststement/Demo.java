import java.util.*;
class Demo{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a num");
  int n=sc.nextInt();
  
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
		
      System.out.print("* ");
	}
	  System.out.println(" ");
    }
  System.out.println("---------------------");
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
		
      System.out.print("* ");
	}
	  System.out.println(" ");
    }
	System.out.println("---------------------");
	for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
		
      System.out.print(j );
	}
	  System.out.println(" ");
    }
	System.out.println("---------------------");
	for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
		
      System.out.print("* ");
	}
	  System.out.println(" ");
    }
	
  }
}