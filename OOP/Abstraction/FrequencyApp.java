/*Q8. Abstract Class to Find Frequency of Elements
Problem:
 Use an abstract class FrequencyFinder with method findFrequency(). Pass an integer array via constructor.
 Implement logic to display frequency of each unique element.
Explanation:
 Tests handling of duplicates and logic-heavy array manipulation using abstract classes.
*/
abstract class FrequencyFinder{
	int n;
	FrequencyFinder(int n){
		this.n=n;
	}
	abstract void findFrequency();
}
class Frequency extends FrequencyFinder{
	Frequency(int n){
		super(n);
	}
	void findFrequency(){
		int[]freq=new int[10];
		while(n!=0){
			int rem=n%10;
			freq[rem]++;
			n/=10;
		}
		for(int i=0;i<=9;i++){
			if(freq[i]>0){
				System.out.print("digit="+i+"frequency="+freq[i]);
			}
		}
	}
}
class FrequencyApp{
	public static void main(String[]x){
		int n=1237232;
		FrequencyFinder f=new Frequency(n);
		f.findFrequency();
	}
}