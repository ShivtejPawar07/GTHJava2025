/*  Write a java program to enter length in centimeter and convert into meter and kilometer.
1km=100000cm
1m=100cm
*/

public class ConCmKm{
  public static void main(String []x){
      float c=Integer.parseInt(x[0]);
	  
	  float m=c/100;
	 float k=c/100000;
	  
	  System.out.println("meter:"+m);
	  System.out.println("killometer:"+k);
	  
  
  }
}