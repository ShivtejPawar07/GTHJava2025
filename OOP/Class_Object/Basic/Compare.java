/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, 
or less.
Explanation: Introduces conditional statements in a method.
*/
class NumberComparison{
	void compare(){
		int a=20,b=10;
		String res= a==b?"Number are equal":
			    a>b?a+" is Greater":
				b+"is Greater";
		System.out.println(res);
	}
}
class Compare{
	public static void main(String x[]){
		NumberComparison n=new NumberComparison();
		n.compare();
	}
}