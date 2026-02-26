/*Merge*/
class MergeApp{
	public static void main(String[]x){
		int[]a={1,2};
		int[]b={5,6,1,2,7,8};
		
		int i=0;
		int j=a.length-1;
		int k=0;
		int c[]=new int[a.length+b.length];
		
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]){
				c[k++]=a[i++];
				c[k++]=b[j--];
			}

		}
		while(i<a.length ){
				c[k++]=a[i++];
		}
		while(j<b.length ){
				c[k++]=b[j--];
		}
		for(int val:c){
			System.out.print(val+" ");
		}
	}
}