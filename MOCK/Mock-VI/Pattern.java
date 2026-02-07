class Pattern{
	public static void main(String[]x){
		//Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(((j==6-i || j==i+4 )&& i<=5)||((j==i-4 || j==14-i)&& i>5)|| j==5 || i==5){
					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}