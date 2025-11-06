/*
Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and 
we have to create three child classes name as Add with function int getAdd() , Mul with function 
getMul() and Div with function getDiv() and getAdd() function return addition of two value which
 is inherited from Value class , getMul() function return multiplication of two values which is 
 inherited from Value class and gitDiv() function return division of two values which Is inherited 
 from Value class.
*/
class Value{
	int a,b;
	setValue(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class Add extends Value{
	int getAdd(){
		return a+b;
	}
}
class Div extends Value{
	int getDiv(){
		return a/b;
	}
}
class Mul extends Value{
	int getMul(){
		return a*b;
	}
}
class Main{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Two Num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Value v=new Value();
		v.setValue();
		System.out.println("Addition"+v.getAdd());
		System.out.println("Division"+v.getMul());
		System.out.println("Addition"+v.getDiv());
	}
}