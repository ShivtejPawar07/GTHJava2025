/*8. Rearrange Array in Alternate Positive and Negative Items
Concept: Use auxiliary arrays or index manipulation to interleave.
 Use Case: Alternate scheduling, balancing data flow.
Input: arr = [2, 3, -4, -1, 6, -9]
 
Separate positives: [2, 3, 6]
Separate negatives: [-4, -1, -9]
Rearranged array: [2, -4, 3, -1, 6, -9]
*/

class Majority {
    public static void main(String x[]) {
        int[] a = {2, 3, -4, -1, 6, -9};
		 System.out.print("Positive array: ");
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				System.out.print(a[i]+" ");
			}
		}
		 System.out.print("Negative array: ");
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				System.out.print(a[i]+" ");
			}
		}
        System.out.print("Rearranged array: ");
        int pos = 0, neg = 0;

        // print alternate positive and negative
        while (pos < a.length && neg < a.length) {
            // find next positive
            while (pos < a.length && a[pos] < 0)
                pos++;

            // find next negative
            while (neg < a.length && a[neg] >= 0)
                neg++;

            // if both available, print one positive then one negative
            if (pos < a.length && neg < a.length) {
                System.out.print(a[pos] + " " + a[neg] + " ");
                pos++;
                neg++;
            }
        }
    }
}
/*
import java.util.*;

class Majority {
    public static void main(String x[]) {
        int[] a = {2, 3, -4, -1, 6, -9};

        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                posList.add(a[i]);
            else
                negList.add(a[i]);
        }

        // Print positives
        System.out.print("Separate positives: ");
        System.out.println(posList);

        // Print negatives
        System.out.print("Separate negatives: ");
        System.out.println(negList);

        // Rearrange alternate
        System.out.print("Rearranged array: ");
        int i = 0, j = 0;

        while (i < posList.size() || j < negList.size()) {

            if (i < posList.size()) {
                System.out.print(posList.get(i) + " ");
                i++;
            }

            if (j < negList.size()) {
                System.out.print(negList.get(j) + " ");
                j++;
            }
        }
    }
}

*/
