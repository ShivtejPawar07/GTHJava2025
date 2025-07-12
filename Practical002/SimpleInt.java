import java.util.*;
public class SimpleInt{
  public static void main(String []x){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter princple amount=");
    float p=sc.nextFloat();
	System.out.println("enter rate=");
    float r=sc.nextFloat();
	System.out.println("enter year=");
    int y=sc.nextInt();
	
	   System.out.println("simple interaste="+(p*r*y)/100);
	
  }
}