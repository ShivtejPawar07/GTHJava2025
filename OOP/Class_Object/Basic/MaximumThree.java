/*6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/
class Maximum{
	void findMax(int n1,int n2,int n3){
		if(n1>n2 && n1>n3)
			System.out.println("Max="+n1);
		else if(n2>n1 && n2>n3)
			System.out.println("Max="+n2);
		else
			System.out.println("Max="+n3);
	}
}
class MaximumThree{
	public static void main(String x[]){
		Maximum m=new Maximum();
		m.findMax(1,2,3);
	}
}