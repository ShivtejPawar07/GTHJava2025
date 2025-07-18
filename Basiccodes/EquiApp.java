/* Write a java program to calculate area of an equilateral triangle.
*/
public class EquiApp
  {
    public static void main(String []x){
	
	 float s=Float.parseFloat(x[0]);
	 
	// System.out.println("Area of equilateral triangle="+((1.73*s*s)/4));
	System.out.println("Area of equilateral triangle="+(Math.sqrt(3)/4)*s*s);
  }
  }