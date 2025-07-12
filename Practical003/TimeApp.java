/*Convert minutes to hours and minutes
*/
public class TimeApp{
  public static void main(String []x){
    int m=Integer.parseInt(x[0]);
	
	int hrs=m/60; //72/60=1hrs
	int min=(m%60);  //72%60=12min
	    System.out.println(hrs+":hrs"+min+":min");
	}
	}
	