/*Armstrong*/

class ArmApp{
	static void isArm(int limit){
		for(int n=1;n<=limit;n++){
		int temp=n;
		int cnt=0;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		temp=n;
		int sum=0;
		while(temp!=0){
			int rem=temp%10;
			sum+=(int)Math.pow(rem,cnt);
			temp/=10;
		}
			if(n==sum)
				System.out.print(n+" ");
			
		}
	}
	public static void main(String[]x){
		int n=1000;
		isArm(n);
	}

}