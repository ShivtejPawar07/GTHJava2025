/*Fiboo*/

class FiboApp{
	static int fiboo(int i){
		if(i<=1)
			return i;
			
		return fiboo(i-1)+fiboo(i-2);
	}
	public static void main(String[]x){
		int limit=7;
		for(int i=0;i<=limit;i++){
			System.out.print(fiboo(i)+" ");
		}
	}
}