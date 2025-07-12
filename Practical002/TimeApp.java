/*	 Write a Java program to convert seconds to hours, minutes and seconds. 
op=1hrs:1min.12sec
*/

public class TimeApp{
  public static void main(String []x){
    int sec=Integer.parseInt(x[0]);
   
	int hrs=sec/3600;  //3672/3600=1hrs
	int min=(sec%3600)/60;//3672%3600=72/60=1min
	sec=sec%60;//3672%60=12sec
    System.out.println(hrs+"hrs:"+min+"min."+sec+"sec");

  
  
  }
   
}