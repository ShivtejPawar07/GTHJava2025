/*Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];//1 1  2 3 4 5
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		Arrays.sort(a);
		int i=0; // slow pointer
        for (int j=1;j<a.length;j++) { // fast pointer
            if (a[j]!=a[i]) {  // found a new element
                i++;
                a[i]=a[j];
            }
        }

        int newLength=i+1;

        System.out.println("Array after removing duplicates:");
        for (int k=0; k<newLength;k++) {
            System.out.print(a[k] + " ");
        }

        System.out.println("\nNew Length = " + newLength);
	}
}