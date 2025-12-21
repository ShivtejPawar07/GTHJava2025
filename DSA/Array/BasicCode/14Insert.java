/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("ENter Array Element");
		for(int i=0;i<a.length-1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length-1;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Enter Index and Value");
		int index=sc.nextInt();
		int value=sc.nextInt();
		
		for(int i=a.length-2;i>=index;i--){
			a[i+1]=a[i];
		}
		a[index]=value;
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
	}
}
/*class InsertArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int pos = 2;      // index
        int value = 99;

        int[] newArr = new int[arr.length + 1];

        // copy elements before position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // insert element
        newArr[pos] = value;

        // copy remaining elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // print array
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}

*/