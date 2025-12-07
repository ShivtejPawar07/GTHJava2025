/*Q2. Create a Vector of integers.
Store 10 numbers and count how many numbers are greater than 50.
Iteration
Logical comparison: num > 50
Counter concept
Explanation
Use a counter that increases each time the number is greater than 50.
*/
import java.util.*;
class CApp{
	public static void main(String[]x){
		
		Vector<Integer>v=new Vector<>();
		
		System.out.println("Enter a 10 Num");
		for(int i=0;i<9;i++){
			v.add(new Scanner(System.in).nextInt());
		}
		int cnt=0;
		for(int num:v){
			if(num>50){
				cnt++;
			}
		}
		System.out.println("numbers are greater than 50.="+cnt);
	}
}