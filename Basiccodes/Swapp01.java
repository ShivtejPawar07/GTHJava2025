public class Swapp01{
  public static void main(String []x){
      int a=Integer.parseInt(x[0]);
	int b=Integer.parseInt(x[1]);
	int temp=0;
	System.out.printf("before swap two num=>a=%d,b=%d\n",a,b);
	temp=a;
	a=b;
	b=temp;
	System.out.printf("after swap two num=>a=%d,b=%d\n",a,b);
	System.out.println("after swap two num="+"a="+a+"b="+b);
  }
}