/*Q1. Abstract Class for Even Numbers Filter
Problem:
 Create an abstract class ArrayProcessor with an abstract method process(). 
 In a subclass, override process() to filter only even numbers from the input array and print them.
Explanation:
 Tests understanding of abstract classes and simple array traversal.
*/

abstract class ArrayProcessor{
	abstract void process(int[]a);
}
class Even extends ArrayProcessor{
	void process(int[]a){
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}
}
class EvenApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5,6,7,8,9};
		
		Even e=new Even();
		e.process(a);
		
		
	}
}


/*
abstract class ArrayProcessor{
	int[]a;
	abstract void process();
	void setArray(int[]a){
		this.a=a;
	}
	
}
class Even extends ArrayProcessor{
	void process(){
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}
}
class EvenApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5,6,7,8,9};
		
		Even e=new Even();
		e.setArray(a);
		e.process();
		
		
	}
}
*/