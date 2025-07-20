/*42Employee salary hike based on performance and years of service:

Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.*/

import java.util.*;
class EmpSal{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the basic salary Years & performance rating(1-5)");
	 int bs=sc.nextInt();
	 int year=sc.nextInt();
	 int rate=sc.nextInt();
	 
	 if(rate>=4 && year>5){
	   System.out.println("New salary:"+(bs+bs*0.20));
	 }
	 
	 else if(rate>=3){
	   System.out.println("New salary:"+(bs+bs*0.10));
	 }else{
	   System.out.println("New salary:"+(bs+bs*0.05));
	 }
	 
   }
}