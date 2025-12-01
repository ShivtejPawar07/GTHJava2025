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
class ArrayOper{
	ArrayOper(int[]a){
		super(a);
	}
	void reverse(){
	}
	void rotateLeft(){
	}
}
class ArrayHandlerApp{
	
}