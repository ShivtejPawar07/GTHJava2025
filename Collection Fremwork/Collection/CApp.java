import java.util.*;
class CApp{
	public static void main(String[]x){
		ArrayList<Integer> al=new ArrayList<>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			
		Iterator i=al.iterator();
			while(i.hasNext()){
				Object obj=i.next();
				System.out.println(obj);
			}
			
		//public abstract int size():
		int a=al.size();
		System.out.println("Size="+a);//4
		
		//public abstract boolean isEmpty()
		boolean b=al.isEmpty();
		System.out.println("isEmpty="+b);//false
		
		//public abstract boolean contains(java.lang.Object)
		boolean b1=al.contains(30);
		System.out.println("Found="+b1);
			
		
	}
}