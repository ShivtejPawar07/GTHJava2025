/*Q2. Abstract Class Constructor to Initialize Array
Problem:
 Create an abstract class BaseArray that takes an integer array through its constructor.
 In the subclass SquareArray, override the method to print the square of each element.
Explanation:
 Focuses on how constructors work with abstract classes and inheritance.
*/
abstract class BaseArray{
	int[]a;
	BaseArray(int[]a){
		this.a=a;
	}
	abstract void square();

}
class SquareArray extends BaseArray{
	SquareArray(int[]a){
		super(a);
	}
	void square(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]*a[i]+" ");
		}
	}
}
class SquareApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5,6,7,8,9};
		
		BaseArray b=new SquareArray(a);
		b.square();
		
		
	}
}