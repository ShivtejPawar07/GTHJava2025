/*Q2. Write program to create class name Area with methods name as void setRadius(float   radius) 
and void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you
 have to define float getCircleArea() method in Circle child class and calculate area of circle and 
 return it and You have to define getRectArea() method in Rectangle class and calculate area of 
 rectangle and return it
*/
class Area{
	int l,w;
	float r;
	void setRadius(float radius){
		r=radius;
	}
	void setLengthWidth(int len,int wid){
		l=len;
		w=wid;
	}
}
class Circle extends Area{
	float getCircleArea(){
		return 3.14f*r*r;
	}
}
class Rectangle extends Area{
	float getRectArea(){
		return l*w;
	}
}
class AreaApp{
	public static void main(String x[]){
		Circle c=new Circle();
		c.setRadius(10);
		System.out.println("Area of Circle="+c.getCircleArea());
		
		Rectangle r=new Rectangle();
		r.setLengthWidth(10,20);
		System.out.println("Area of Rectangle="+r.getRectArea());
	}
}