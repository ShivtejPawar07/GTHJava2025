/*Q9. Abstract Class with Reverse and Rotate Operations
Problem:
 Design an abstract class ArrayHandler with two abstract methods reverse() and rotateLeft(). 
 In subclass, implement both operations and apply them on the array passed via constructor.
Explanation:
 Combines multiple array operations with abstract method inheritance.
*/
abstract class ArrayHandler{
	int[]a;
	ArrayHandler(int[]a){
		this.a=a;
	}
	abstract void reverse();
	abstract void rotateLeft();
}
class ArrayOper extends ArrayHandler{
	ArrayOper(int[]a){
		super(a);
	}
	void reverse(){
		for(int i=0,j=a.length-1;i<j;i++,j--){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Reverse");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	void rotateLeft(){
		int k=2;
		while(k!=0){
			int temp=a[0];
			for(int i=0;i<a.length-1;i++){
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			k--;
		}
		System.out.println("Rotate left");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
class ArrayHandlerApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5};
		ArrayHandler ah=new ArrayOper(a);
		ah.reverse();
		ah.rotateLeft();
	}
}