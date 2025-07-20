/*
Q17. Write a Java program to convert seconds to hours, minutes and seconds
*/
import java.util.*;
public class HrsMinSec{
  public static void main(String []x){
   Scanner sc=new Scanner(System.in);
   System.out.println("eenter second");
   int sec=sc.nextInt();
	int hrs=sec/3600;//4222/3600=1hrs
	int min=(sec%3600)/60;//622/60=10min
	sec=sec%60;//4222%60=22
    System.out.println(hrs+"hrs:"+min+"min:"+sec+"sec:");

	
  
  }
   
}