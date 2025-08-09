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
			}
			System.out.println();
		}
/*
Mixed Pattern
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1
*/
		System.out.println("Mixed Pattern");
		int n=1,nn=0;
		for(int i=1;i<=8;i++){
				boolean flag=true;
				if(i==5)
					nn=7;
                else if(i==6)
					nn=4;
                else if(i==7) 
					nn=2;
				else if(i==8)
					nn=1;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i && flag && i<=4 ){
					System.out.print(n++);
					flag=false;
				}
				else if(j>=i-4 && j<=12-i && flag && i>=5){
					System.out.print(nn++);
					flag=false;
				}
				else if((j>=5-i && j<=3+i && !flag && i<=4 )||(j>=i-4 && j<=12-i && !flag && i>=5)){
					System.out.print("*");
					flag=true;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}