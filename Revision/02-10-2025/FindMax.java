/*Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.
*/
class FindMax{
	int[]a;
	void setArray(int a[]){
		this.a=a;
	}
	int getMax(){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String args[]){
		int[] a={10,23,6,2,77,45};
		
		FindMax fm=new FindMax();
		fm.setArray(a);
		System.out.println("MAx="+fm.getMax());
	}
}