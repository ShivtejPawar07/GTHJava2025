/*  Write a java program to enter length in centimeter and convert into meter and kilometer.
*/
public class ConCmKm{
  public static void main(String []x){
      float c=Integer.parseInt(x[0]);
	  
	  float m=c/100;
	 float k=m/1000;
	  
	  System.out.println("meter:"+m);
	  System.out.println("killometer:"+k);
	  
  
  }
}