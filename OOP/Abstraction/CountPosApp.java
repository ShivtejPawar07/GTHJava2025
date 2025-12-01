/*Q3. Abstract Method to Count Positive Numbers
Problem:
 Define an abstract class ArrayStats with a method countPositive(). 
 Implement this in a subclass to count and return the number of positive elements in an array.
Explanation:
 Combines abstract method logic with counting operations on arrays.
*/
abstract class ArrayStats{
	abstract int countPositive(int[]a);
}
class CountPos extends ArrayStats{
	int cnt=0;
	int countPositive(int[]a){
		for(int val:a){
			if(val>0)
				cnt++;
		}
		return cnt;
	}
	
}
class CountPosApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5,6,7,8,9};
		
		ArrayStats as=new CountPos();
		System.out.print("Count="+as.countPositive(a));
		
		
	}
}