/*Arrocc*/

import java.util.*;
class Arrocc{
	public static void main(String[]x){
		int[]a={1,1,5,2,6,5,2};
		
		boolean[]visited=new boolean[a.length];
		for(int i=0;i<a.length;i++){
			if(visited[i]==true){
			continue;
			}
			int cnt=0;
		    for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					cnt++;
					visited[j]=true;
				}
			}
			System.out.print(a[i]+"="+cnt+"\n");
		}
	}
}