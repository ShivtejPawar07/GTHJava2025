/*Convert inches to centimeters
  1 inch= 2.54cm;
  1/0.39=...cm
*/
public class InchToCm{
  public static void main(String []x){
      double a=Double.parseDouble(x[0]);
	  double b=a/0.39;
	  System.out.printf("%f inch to %f cm",a,b);
  
  }
}