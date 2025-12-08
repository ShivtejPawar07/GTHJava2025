/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
class  Desending{
	public static void main(String[]x){
		ArrayList<Integer>al=new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		System.out.println("ArrayList="+al);
		Vector<Integer>v=new Vector();
		for(int n:al){
			v.add(n);
		}
		System.out.println("Vector="+v);
		
		for(int i=0;i<v.size();i++){
			for(int j=i+1;j<v.size();j++){
				if(v.get(i)<v.get(j)){
					int temp=v.get(i);
					v.set(i,v.get(j));
					v.set(j,temp);
				}
			}
		}
		System.out.println("Vector after sorting (Descending): " + v);
	}

}