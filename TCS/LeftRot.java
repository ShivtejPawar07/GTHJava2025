/*Left roatation*/


class LeftRot{
	public static void main(String[]x){
		int[]a={1,2,3,4,5};//3 4 5 1 2 
		int k=2;
		while(k!=0){
			int temp=a[0];
			for(int i=0;i<a.length-1;i++){
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			k--;
		}
		for(int val:a){
			System.out.print(val+" ");
		}
		
	}
}