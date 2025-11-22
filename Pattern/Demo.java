/*
                1 
		    1        1 
         1               1 
       1                     1 
    1    2      3        4     1    
*/
class Demo{
	public static void main(String x[]){
		int a=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i || j==4+i){
					System.out.print(1);
				}
				else if(i==5 && j%2!=0){
					System.out.print(++a);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
		for(int i=1;i<=7;i++)
		{
			int n=(i<=4)? i:8-i;
			int count=n;
			for(int j=1;j<=count;j++)
			{
				System.out.print(n);
				if(j!=count){
					System.out.print(" * ");
				}
				
			}
			System.out.print("\n");
		}
		for(int i=1;i<=7;i++)
		{
			int n=(i<=4)? i:8-i;
			int count=n;
			for(int j=1;j<=count;j++)
			{
				System.out.print(n);
				if(j!=count){
					System.out.print(" * ");
				}
				
			}
			System.out.print("\n");
		}
	}
} 