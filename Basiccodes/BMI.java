//Calculate the BMI (Body Mass Index) from height and weight
import java.util.*;
class Bmi{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight and height");
		float w=sc.nextInt();
		float h=sc.nextInt();
		
		float bmi=(w/(h*h))*10000;
		System.out.println(bmi);
		
	}
}