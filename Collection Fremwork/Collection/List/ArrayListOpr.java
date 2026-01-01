/* Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
*/
import java.util.*;
class ArrayListOpr{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(3);
			al.add(4);
			al.add(4);
		
		System.out.println("ArrayList="+al);
		Iterator itr=al.iterator();
		System.out.println("ArrayList use cursor=");
		while(itr.hasNext()){
			Object obj=itr.next();
			System.out.println(obj);
		}
		System.out.println("ArrayList use for each=");
		for(int val:al){
			System.out.println(val);
		}
		
		int sum=0;
		for(int val:al){
			sum+=val;
		}
		System.out.println("Sum of List="+sum);
		
		//System.out.println("Max Element="+Collections.max(al));
		//System.out.println("Min Element="+Collections.min(al));
		int max=0,min=Integer.MAX_VALUE,ecnt=0,ocnt=0;
		for(int val:al){
			if(val>max){
				max=val;
			}
			if(val<min){
				min=val;
			}
			if(val%2==0){
				ecnt++;
			}
			else
				ocnt++;
		}
		System.out.println("Max Element="+max);
		System.out.println("Min Element="+min);
		System.out.println("Evenn Element="+ecnt);
		System.out.println("Odd Element="+ocnt);
		
		
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					System.out.println("Duplicate: " + al.get(i));
				}
			}
		}
		
		System.out.println("Enter a skey");
		int skey=sc.nextInt();
		
		boolean flag=false;
		for(int val:al){
			if(skey==val)
				flag=true;
		}
		if(flag==true)
			System.out.println("Skey Found");
		else
			System.out.println("Skey not Found");
	}
}