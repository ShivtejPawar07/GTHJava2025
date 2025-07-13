
/*WJP to enetr cm to convert into m and km*/
/*1m=100cm
  1000m=1km
  1km=100000cm
  1m=
  */
import java.util.*;
public class CmApp{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the cm");
	int cm=sc.nextInt();//110000
	
	int km=cm/100000;//110000/100000=1km
	int me=cm%100000;//110000%100000=10000
	
	int m=me/100;//10000/100=100m
	
	int cmm=me%100;//
	
	System.out.println(km+"km "+m+"m "+cmm+"cm ");
	
  }
}