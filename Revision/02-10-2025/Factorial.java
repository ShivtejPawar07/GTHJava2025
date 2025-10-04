/*Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.
*/
class Factorial{
	static int x;
	static void setValue(int xx){
		x=xx;
	}
	static int getFactorial(){
		int  fact=1;
		for(int i=1;i<=x;i++){
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args){
		int xx=4;
		//Factorial f=new Factorial();
		Factorial.setValue(xx);
		System.out.println(Factorial.getFactorial());
	}
}