class Mixed{
	public static void main(String x[]){
		/*
Mixed Pattern
****1****
***2*2***
**3*3*3**
*4*4*4*4*
5*5*5*5*5
*/	
		System.out.println("Mixed Pattern");
		for(int i=1;i<=5;i++){
			boolean flag=true;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i &&flag){
					System.out.print(i);
					flag=false;
				}
				else{
					System.out.print("*");
					flag=true;
				}
			}
			System.out.println();
		}
/*
Mixed pyramid
   1
  2*2
 3*3*3
4*4*4*4
4*4*4*4
 3*3*3
  2*2
   1
*/
		System.out.println("Mixed pyramid ");
           int cnt=64;		
	       for(int i=1;i<=8;i++){
			   boolean flag=true;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i && flag && i<=4){
					System.out.print(i);
				    flag=false;
			    }
                else if(j>=i-4 && j<=12-i && flag && i>4){
					System.out.print(9-i);
				    flag=false;
				}
                else if((j>=5- i && j<=3+i && !flag && i<=4) ||(j>=i-4 && j<=12-i && !flag && i>4)) {
                    System.out.print("*");
                 flag = true;
                } 				
                else{
					System.out.print(" ");
					flag=true;
				}				
			}
			System.out.println();
		}
	
	}
}