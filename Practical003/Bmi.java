/* Calculate the BMI (Body Mass Index) from height and weight

*/
public class Bmi{
  public static void main(String []x){
     float h=Float.parseFloat(x[0]);
	 float w=Float.parseFloat(x[1]);
    System.out.println("BMI=>"+(w/(h*h)));
	
  }
}