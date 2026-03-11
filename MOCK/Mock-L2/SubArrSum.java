/* 
Q2.Write a program in java to find a subarray with given sum from the given array? 
Output : 
  The given array is : 3 4 -7 1 3 3 1 -4 
  [0..1] -- { 3 4 } 
  [0..5] -- { 3 4 -7 1 3 3 } 
  [3..5] -- { 1 3 3 } 
  [4..6] -- { 3 3 1 }
  */
  
class SubArrSum{
	public static void main(String[]x){
		int[]a={3,4,-7,1,3,3,1,-4 };
		
		int gsum=7;
		
		for(int i=0;i<a.length;i++){
			int sum=0;
			
			for(int j=i;j<a.length;j++){
				sum+=a[j];
				if(sum==gsum){
					System.out.print("["+i+".."+j+"]"+"-- {");
					
					for(int k=i;k<=j;k++){
						System.out.print(a[k]+" ");
					}
					System.out.println("}");
				}
			}
		}
	}
}