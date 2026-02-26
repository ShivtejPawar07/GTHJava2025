/*Write a java program to find armstrong number of a array.*/
class ArmArr{
	public static void main(String[]x){
		int[]a={1,5,8,153,28,56,45};
		for(int i=0;i<a.length;i++){
			int temp=a[i];
			int cnt=0;
			while(temp!=0){
				temp/=10;
				cnt++;
			}
			temp=a[i];
			int sum=0;
			while(temp!=0){
				int rem=temp%10;
				sum+=(int)Math.pow(rem,cnt);
				temp/=10;
			}
			if(a[i]==sum)
				System.out.print(a[i]+" ");
		}
	}
}