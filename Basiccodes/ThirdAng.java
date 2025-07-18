/*Q9. Write a java program to enter two angles of a triangle and find the third angle.*/
public class ThirdAng{
  public static void main(String []x){
     int a=Integer.parseInt(x[0]);
	 int b=Integer.parseInt(x[1]);
	
	 
	 System.out.println("Third angle:"+(180-(a+b)));
  }
}