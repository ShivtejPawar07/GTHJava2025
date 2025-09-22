/*10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/
import java.util.*;
class Circle{
	double findArea(double r){
		return 3.14*r*r;
	}
}
class CircleArea{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		
		System.out.println("Enter a Number");
		double r=sc.nextInt();
		System.out.println("Area of circle="+c.findArea(r));
	}
}