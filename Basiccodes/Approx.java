//Check if two float numbers are approximately equal
import java.util.*;
class Approx{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		double eps=0.00005;
			
		if(Math.abs(f1-f2)<eps)
			System.out.println("Equal");
		else
			System.out.println("Not");
		
	}

}
