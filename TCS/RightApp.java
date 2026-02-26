/*Right rotation */

class RightApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5};//4 5 1 2 3
		int k=2;
		
		while(k!=0){
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--){
				a[i]=a[i-1];
			}
			a[0]=temp;
		k--;
		}
		for(int val:a){
			System.out.print(val+" ");
		}
	}
}