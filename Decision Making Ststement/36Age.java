/*Q36. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
	
Category	Age Range

Child		0 – 12 years
Teenager	13 – 19 years
Adult		20 – 59 years
Senior		60 years and above
*/
import java.util.*;
class Age
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		int age;
		System.out.println("enter age:");
		age = sc.nextInt();
		if(age>=0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else if(age>=60)
		{
			System.out.println("Senior");
		}
		else{
			System.out.println("Invalid");
		}
	}
}