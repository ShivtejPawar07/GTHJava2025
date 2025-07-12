/* Calculate the perimeter of a triangle
 perimeter=a+b+c
*/
public class TriPerim{
  public static void main(String []x){
    double s1=Double.parseDouble(x[0]);
	double s2=Double.parseDouble(x[1]);
	double s3=Double.parseDouble(x[2]);
	
	System.out.println("perimeter of triangle="+(s1+s2+s3));
  }
}