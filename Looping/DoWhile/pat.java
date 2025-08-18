/*
*
***
*****
*******
*********
*******
*****
***
*
 */
class Demo{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
			for(int j=1,a=1;j<=9;j++){
				if(j<=i*2-1 && j%2!=0){
				System.out.print(a++);
				}
				else if(j<=i*2-1 && j%2==0){
					System.out.print("*"); 
				}
				
			}
			System.out.println();
		}
/*
Mixed Pattern
*
*1*
*121*
*12321*
*121*
*1*
*
*/	
	    int temp=1;
        for (int i=1;i<=7;i++) 
        {
            int num=1;
            for (int j=1;j<=7;j++) 
            {
                if (j<=temp) 
                {
                    if(j==1||j==temp) 
                    {
                        System.out.print("*");
                    }
                    else if(i<=4 && j<=temp/2)
                    {				
                        System.out.print(num++);
                    }
                    else
                    {
                        if (i>4 && j==3) 
							num = 2; 
                        System.out.print(num--);
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<4) 
                temp+=2;
            else
                temp-=2;
		}
				
				
				
			
	
		
	}
}