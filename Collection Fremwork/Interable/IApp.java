import java.util.*;
class IApp{
	public static void main(String[]x){
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		al.add("Shivtej");
		al.add("MsDhoni");
		al.add("Tej");
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	
	}
}