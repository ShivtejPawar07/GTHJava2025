/*
Q3. Write a java program using constructor overloading with class name as ArrayCons 
ArrayCons (int a [],int value): this function is used for accept array as parameter and pass value and 
search value in array. 
ArrayCons(int a[]): this function will accept array as parameter and find maximum value from array. */

class ArrayCons{
	int a [];
	int value;
	ArrayCons (int a [],int value){
		this.a=a;
		this.value=value;
	}
	ArrayCons(int a[]){
		this.a=a;
	}
	void max() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);
	}
	void search(){
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==value)
				flag=true;
		}
		if(flag)
			System.out.println("found");
		else
			System.out.println("Not found");
	}
	public static void main(String[]x){
		int[]a={1,2,10,3,4};
		ArrayCons aa=new ArrayCons(a,10);
		aa.search();
		ArrayCons aa1=new ArrayCons(a);
		aa1.max();
	}
}