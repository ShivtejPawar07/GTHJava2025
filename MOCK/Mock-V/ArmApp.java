/*Q1. Write a Java program to create a class named Armstrong with the following methods: 
1. void setNum(int no) – to accept a number. 
2. void checkArm() – to check whether the given number is an Armstrong number or not.*/

class ArmApp{
	int n;
	void setNum(int n){
		this.n=n;
	}
	void checkArm(){
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
		if(sum==n)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
	public static void main(String[]x){
		ArmApp aa=new ArmApp();
		aa.setNum(153);
		aa.checkArm();
	}
}