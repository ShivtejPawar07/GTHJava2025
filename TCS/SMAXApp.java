import java.util.*;
class SMAXApp{
	public static void main(String[]x){
		int[]a={1,2,4,3,2,4};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(a[i]!=max && a[i]>smax){
				smax=a[i];
			}
		}
		System.out.println(smax);
	}
}