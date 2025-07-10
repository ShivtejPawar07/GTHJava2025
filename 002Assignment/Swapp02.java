public class Swapp02{
  public static void main(String []x){
      int a=Integer.parseInt(x[0]);
	int b=Integer.parseInt(x[1]);
	System.out.printf("before swap two num=>a=%d,b=%d\n",a,b);
	a=a+b;//10+20=30
	b=a-b;//30-10=20
	a=a-b;//30-20=10 i.e b=20,a=10
	System.out.printf("after swap two num=>a=%d,b=%d\n",a,b);
	
  }
}