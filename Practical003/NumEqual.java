/*Check if two float numbers are approximately equal
op=java NumEqual 1.234567 1.234568
*/

public class NumEqual{
  public static void main(String []x){
     float n1=Float.parseFloat(x[0]);
	 float n2=Float.parseFloat(x[1]);
	 
	 float epsilon = 0.0001f; // you can adjust this threshold based on precision needed
	 
	// String s=(n1==n2)?"Numbers are equal":"Numbers are not equal";//It is not approximately
   // System.out.println(s);
   /*if(Math.abs(n1-n2)<=epsilon)
	  System.out.println("Numbers are equal");
	  else
		System.out.println("Numbers are not equal");  
	   */
	    String s=(n1-n2<=epsilon)?"Numbers are equal":"Numbers are not equal";
   System.out.println(s);
   
  }
}