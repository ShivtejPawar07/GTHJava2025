/*7. First Negative Number in Every Window of Size K

Approach: Sliding Window with queue
Example: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
*/
import java.util.*;
class FirstNeg{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element in an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int k=3;
		for(int i=0;i<=n-k;i++){
			boolean flag=false;
				for(int j=i;j<i+k;j++){
					if(a[j]<0){
						System.out.println("1st negative Windows "+(i+1)+"="+a[j]);
						flag=true;
						break;
					}
				}
				if(!flag)
					System.out.println("1st negative Windows "+(i+1)+"=windows not found");
		}
	}
}
/*
🧩 Iteration Breakdown
🔹 i = 0 → window = [0..2] → [12, -1, -7]

j = 0 → 12 → not negative

j = 1 → -1 → negative ✅
→ print “1st negative window 1 = -1”

🔹 i = 1 → window = [1..3] → [-1, -7, 8]

j = 1 → -1 → negative ✅
→ print “1st negative window 2 = -1”

🔹 i = 2 → window = [2..4] → [-7, 8, -15]

j = 2 → -7 → negative ✅
→ print “1st negative window 3 = -7”

🔹 i = 3 → window = [3..5] → [8, -15, 30]

j = 3 → 8 → not negative

j = 4 → -15 → negative ✅
→ print “1st negative window 4 = -15”

🔹 i = 4 → window = [4..6] → [-15, 30, 16]

j = 4 → -15 → negative ✅
→ print “1st negative window 5 = -15”

🔹 i = 5 → window = [5..7] → [30, 16, 28]

j = 5 → 30 → not negative

j = 6 → 16 → not negative

j = 7 → 28 → not negative
→ no negatives ❌
→ print “1st negative window 6 = window not found”

✅ Final Output
1st negative window 1 = -1
1st negative window 2 = -1
1st negative window 3 = -7
1st negative window 4 = -15
1st negative window 5 = -15
1st negative window 6 = window not found
*/