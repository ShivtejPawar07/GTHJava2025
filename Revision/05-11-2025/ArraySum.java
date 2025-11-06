/*Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have
 to create child class name as GetSum with method int getArrSum() you have to accept array values
 from ArrSum and calculate its sum and return it
*/
class ArrSum{
	int[]a;
	void setValue(int arr[]){
		a=arr;
	}
	public static void main(String x[]){
		int[]a={1,2,3,4,5};
		GetSum as=new GetSum();
		as.setValue(a);
		
		System.out.println("Array sum="+as.getArrSum());
	}
}
class GetSum extends ArrSum{
	int getArrSum(){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
}