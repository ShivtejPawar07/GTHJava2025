/*Q7Maximum Number of Vowels in a Substring of Given Length
Find the maximum number of vowels in any substring of length k.*/
class SubStringVowel{
	public static void main(String args[]){
		String str = "shivtej";
		char arr[] = str.toCharArray();//['s','h','i','v','t','e','j']
		int k = 3;
		int low = 0;
		int high = k;
		int cnt = 0;
		while(high<=arr.length){
			String sub = str.substring(low, high); //(0,3)
			System.out.printf("%s :",sub);//shi
			char subArray[] = sub.toCharArray();//['s','h','i']
			cnt = 0;
			for(int i=0;i<subArray.length;i++){
				if(subArray[i]=='a' ||subArray[i]=='e'||subArray[i]=='i'||subArray[i]=='o'||subArray[i]=='u'){
					cnt++;
				}
			}
			System.out.printf("%d\n",cnt);
			low++;//1
			high++;//4
		}
	}
}