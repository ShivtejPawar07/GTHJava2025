/**/
import java.util.*;
class LongSeq{
	public static void main(String[]x){
		int[]a={1,3,2,4,5,8,9,200};
		
		int cnt=1;
		int longest=1;
		
		Arrays.sort(a);
		
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1]+1){
				cnt++;
			}
			else if(a[i]!=a[i-1]){
				cnt=1;
			}
			if(cnt>longest){
				longest=cnt;
			}
		}
		System.out.print(longest);
	
	}
}