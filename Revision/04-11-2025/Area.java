/*Q4. Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/
class Area{
	float r;
	int l;
	int w;
	Area(float radius){
		r=radius;
		System.out.println("Area of circle="+(3.14*r*r));
	}
	Area(int len,int width){
		l=len;
		w=width;
		System.out.println("area of rectangle="+(l*w));
	}
	public static void main(String[]x){
		new Area(2);
		new Area(2,4);
	}
	
}