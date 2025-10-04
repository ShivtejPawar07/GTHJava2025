/*Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array
*/
class SortArr{
	int[]a;
	void setArray(int a[]){
		this.a=a;
	}
	int [] getSortArray(){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String args[]){
		int[] a={10,23,6,2,77,45};
		
		SortArr s=new SortArr();
		s.setArray(a);
		int xx[]=s.getSortArray();
		for(int i=0;i<a.length;i++){
			System.out.print(xx[i]+" ");
		}
	}
}