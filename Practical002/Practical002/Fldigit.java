public class Fldigit{
  public static void main(String []x){
     int n=Integer.parseInt(x[0]);
	 //123=      123/100
	 
	 System.out.println("Last Digit:"+n%10);
	  System.out.println("First Digit:"+n/100);
	 
  }
}