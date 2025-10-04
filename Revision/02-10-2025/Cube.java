/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.
*/

class Cube{
	int x;
	void setValue(int x){
		this.x=x;
	}
	int getCube(){
		return x*x*x;
	}
	public static void main(String[] args){
		Cube c=new Cube();
		c.setValue(5);
		System.out.println("cube="+c.getCube());
	}
}