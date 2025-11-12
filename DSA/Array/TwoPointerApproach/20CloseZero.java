import java.util.*;
class CloseZero{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a={38,44,63,-51,-35,19,84,-69,4,-46};
		int min=Integer.MAX_VALUE;
		 int num1 = 0, num2 = 0;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				int sum=a[i]+a[j];
				if(Math.abs(sum)<Math.abs(min)){
					min=sum;
					num1 = a[i];
                    num2 = a[j];
				}
			}
		}
		  System.out.println("Pair closest to zero: (" + num1 + ", " + num2 + ")");
        System.out.println("Sum = " + min);
	}

}