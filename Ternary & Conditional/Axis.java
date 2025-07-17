/*Given (x, y), print quadrant I, II, III, IV or "Axis".*/
import java.util.*;
public class Axis{
  public static void main(String xx[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the x and y");
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 
	  String result =   (x > 0 && y > 0) ? "Quadrant I" :
                        (x < 0 && y > 0) ? "Quadrant II" :
                        (x < 0 && y < 0) ? "Quadrant III" :
                        (x > 0 && y < 0) ? "Quadrant IV" :
                        (x ==|| y==0)?"Axis":
						(x == && y==0)?"Origin":
						"Invalid Input";
				   
				   System.out.println(result);
  }
}