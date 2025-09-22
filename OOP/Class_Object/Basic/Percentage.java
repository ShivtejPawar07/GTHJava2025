/*Percentage*/
import java.util.*;
class Per{
		int sub[];
		void setMarks(int marks[]){
			sub=marks;
		}
		int getPer(){
			int sum=0;
			for(int i=1;i<sub.length;i++){
				sum+=sub[i];
			}
			return sum/sub.length;
		}
	public static void main(String x[]){
		Per p=new Per();
		int marks[]=new int[]{10,20,30,40,50,60};
		p.setMarks(marks);
		System.out.println(p.getPer());
	}
}
/*
class Per  //step1- declaration of class
{   int sub[];//instance variable 
   void setMarks(int s[]) //step2- defintion of class
   { System.out.println("Hashcode of s "+System.identityHashCode(s));  
       sub=s;
	   System.out.println("Hashcode of sub "+System.identityHashCode(sub));
   }
   int getPer()
   {    int agg=0;
	   for(int i=0; i<sub.length; i++)
	   {   agg=agg+sub[i];
	   }
	   return agg/sub.length; 
   }
}
public class PAPP
{
     public static void main(String x[])
	 {
	       Per p1 = new Per();
		   int marks[]=new int[]{60,60,60,60,60,60};
  System.out.println("Hashcode of marks "+System.identityHashCode(marks));
		   p1.setMarks(marks);
		   int result=p1.getPer();
		   System.out.println("Percentage is  "+result);
	 }
}

*/