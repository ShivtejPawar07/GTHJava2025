/*
Q17. Write a Java program to convert seconds to hours, minutes and seconds
*/
public class HrsMinSec{
  public static void main(String []x){
  
	int hrs=sec/3600;
	int min=(sec%3600)/60;
	sec=sec%60;
    System.out.println(hrs+"hrs:"+min+"min:"+sec+"sec:");

  
  
  }
   
}