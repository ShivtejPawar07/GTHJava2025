class Pattern{
	public static void main(String x[]){
		for(int i=1;i<=7;i++){
			for(int j=1,a=65;j<=8;j++){
				if(((j<=i || j>=9-i) && i<=4) || ((j<=8-i || j>=1+i) && i>4)){
					if(j<5)
						System.out.print((char)a+++" ");
					else
						System.out.print((char)--a+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}