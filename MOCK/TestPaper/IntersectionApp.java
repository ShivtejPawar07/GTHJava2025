/*7
️) Intersection of Two Arrays 
Return the intersection of two arrays as unique elements. 
Example 
Input: [1,2,2,1], [2,2] → [2]*/

import java.util.*;
class IntersectionApp{
	public static void main(String[]x){
		/*int[]a={1,2,2,1};
		int[]b={2,2};
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0;
		System.out.println("\n\nIntersection of Arrays:");
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				i++;
			}
			else if(a[i]>b[j]){
				j++;
			}
			else{
				  // Avoid duplicate printing
                if (i == 0 || a[i] != a[i - 1]) {
                    System.out.println(a[i]);
                }
                i++;
                j++;
			}
		}*/


        Integer[] a = {1, 2, 2, 1};
        Integer[] b = {2, 2,1,3,4,5};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(a));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

        set1.retainAll(set2);   // keeps only common elements

        System.out.println("Intersection: " + set1);


	}
}
