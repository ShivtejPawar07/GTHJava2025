/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. 
Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
class Calculator{
	int a=20,b=10;
	void add(){
		System.out.println("Addition="+(a+b));
	}
	void sub(){
		System.out.println("subtract="+(a-b));
	}
	void mul(){
		System.out.println("Multiply="+(a*b));
	}
	void div(){
		System.out.println("Divide="+(a/b));
	}
}
class CalApp{
	public static void main(String x[]){
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();	
	}
}