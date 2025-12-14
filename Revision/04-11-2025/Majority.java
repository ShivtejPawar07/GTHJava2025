/*7.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/
class Majority{
	public static void main(String x[]){
		int[]a={2, 2, 1, 1, 2, 2, 2};
		int maj=0;
		for(int i=0;i<a.length;i++){
			int cnt=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					cnt++;
				}
			}	
				if(cnt>a.length/2){
					maj=a[i];
					break;
				}
		}
		if(maj!=0){
			System.out.println("majority"+maj);
		}
		else{
			System.out.println("nooo");
		}
	}
}