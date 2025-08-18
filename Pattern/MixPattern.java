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
		System.out.println("Mixed Pattern");
		for(int i=1;i<=7;i++){
			int a=1;
			for(int j=1;j<=7;j++){
				if(j==5-i || j==3+i || j==i-3 || j==11-i){
					System.out.print("*");
				}
				else if((j>=6-i && j<=2+i && i>=2 && i<=4)||(j>=i-2 && j<=10-i && i>=5 && i<=6) ){
					if(j<4)					
						System.out.print(a++);
					else 
						System.out.print(a--);
				
				}
				else{
					System.out.print(" ");
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
		System.out.println("Mixed Pattern");
		for(int i=1;i<=7;i++){
			int a=1;
			for(int j=1;j<=7;j++){
				if(j==5-i || j==3+i || j==i-3 || j==11-i){
					System.out.print("*");
				}
				else if((j>=6-i && j<=2+i && i>=2 && i<=4)||(j>=i-2 && j<=10-i && i>=5 && i<=6) ){
					if(j<4)					
						System.out.print(a++);
					else 
						System.out.print(a--);
				
				}
			}
			System.out.println();
		}
/*
What is Pascal’s Triangle?
Pascal’s Triangle is a triangular arrangement of numbers where:
The first and last number in each row is always 1.
Every number in between is the sum of the two numbers above it from the previous row.
Pascale Triangle
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1

*/   
     System.out.println("Pascale Triangle");
     for (int i=0;i<7;i++) {
            int num=1;
            for (int j=0;j<7;j++) {			
				if(j<=i){
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
				}	
            }
            System.out.println();
        }
/*
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/
		System.out.println("Mix Pattern");
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
	}
}