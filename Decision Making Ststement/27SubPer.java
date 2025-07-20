/*Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
    Mathematics and Computer, calculate percentage and grade according to given conditions:
                            percentage >= 90% : Grade A
                            percentage >= 80% : Grade B
                            percentage >= 70% : Grade C
                            percentage >= 60% : Grade D
                            percentage >= 40% : Grade E
                            percentage < 40% : Grade F    */
							
import java.util.*;
class SubMark{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of 5 subjects");
	int s1=sc.nextInt();
	int s2=sc.nextInt();
	int s3=sc.nextInt();
	int s4=sc.nextInt();
	int s5=sc.nextInt();
	
	int total=s1+s2+s3+s4+s5;
	
	float per=(total*100)/500;
	
     if(per>=90 && per<=100)
	    System.out.println("Grade A");
		
	 else if(per>=80 && per<=90)
	   System.out.println("Grade B");
	
	  else if(per>=70 && per<=80)
	   System.out.println("Grade C");
	
	  else if(per>=50 && per<=70)
	   System.out.println("Grade D");
	
	else if(per>=40 && per<=50)
	   System.out.println("Grade E");
	   
	   else
	   System.out.println("Grade F");
  }
}							