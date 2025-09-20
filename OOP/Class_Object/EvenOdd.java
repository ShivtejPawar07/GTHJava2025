/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
class NumberChecker{
	String isEven(int n){
		return  n%2==0?"Even":"Odd";
	
	}
}
class EvenOdd{
	public static void main(String x[]){
		NumberChecker n=new NumberChecker();
		System.out.println(n.isEven(56));
	}
}