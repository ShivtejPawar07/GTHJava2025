class Pat{
	public static void main(String x[]){
	System.out.println("Mix Pattern");
			for(int i=1;i<=5;i++){
				/*for(int j=1,a=1;j<=9;j++){
					if(j<=i*2-1 && j%2!=0){
					System.out.print(a++);
					}
					else if(j<=i*2-1 && j%2==0){
						System.out.print("*"); 
					}*/
					for(int j=1;j<=i;j++)
					{
						if(j==i)
						{
							System.out.print(j);
						}
						else
						{
							System.out.print(j+"*");
						}
					}
				System.out.println();
			}
    /*
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1
	*/	
	    int a=1,aa=7;
		for(int i=1;i<=8;i++){
			for(int j=1;j<=4;j++){
				if(j<=i && i<=4){
					if(j==i && i<=4){
						System.out.print(a++);
					}
					else{
						System.out.print((a++)+"*");
					}
				}
				else if(j<=9-i && i>4){
					if(j<=9-i && i<=4){
						System.out.print(aa++);
					}
					else{
						System.out.print((aa--)+"*");
					}
				}
			}
			System.out.println();
		}
	}
}	
	