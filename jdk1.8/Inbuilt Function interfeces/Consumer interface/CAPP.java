import java.util.function.*;
class CAPP{
	public static void main(String[]x){
		Consumer<Integer>c=new Consumer<Integer>(){
			public void accept(Integer no){
				System.out.println(no);
			}
		};
		c.accept(10);
	}
}