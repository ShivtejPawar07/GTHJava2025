/*Q26.Write a java program to accept the height of a person in centimeters and 
      categorize the person according to their height.

    PerHeight < 150.0  : The person is Dwarf.
     PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
     PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
     Test Data : 135
                            Expected Output :
                            The person is Dwarf.*/
						
import java.util.*;
class Height{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter height of person");
	float n=sc.nextInt();
	
	if(n<150.0)
	  System.out.println("The person is Dwarf");
    else if(n >= 150.0 && n < 165.0 )
	    System.out.println("The person is average heighted.");
    else if(n >= 165.0 && n <= 195.0 )
	    System.out.println("The person is taller.");
    else
	    System.out.println("Invalid input.");
  }
}						