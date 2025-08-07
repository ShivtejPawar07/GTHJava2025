class Pattern2{
	public static void main(String x[]){
	    
/*
Half Pyramid
1
12
123
1234
12345
*/
        System.out.println("Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1,a=1;j<=5;j++){
				if(j<=i)
				    System.out.print(a++);
			}
			System.out.println();
		}
/*
Inverted Half Pyramid
12345
1234
123
12
1
*/
		System.out.println("Inverted Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1,a=1;j<=5;j++){
				if(i<=j)
				    System.out.print(a++);
			}
			System.out.println();
		}
/*
Hollow Half Pyramid
1
12
1 3
1  4
12345
*/
		System.out.println("Hollow Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j ||j==1 || i==5)//i==j
				    System.out.print(j);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
/*
Hollow Half Pyramid
12345
2  3
3 4
45
5
*/
	    System.out.println("Hollow Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1,a=i;j<=5;j++){
				if(i==1 ||j==1||j==6-i )
				    System.out.print(a++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

/*
Hollow Full Pyramid.
   1
  1 2
 1   3
1      4
*/
		
		System.out.println("Hollow Full Pyramid.");
		for(int i=1;i<=5;i++){
			for(int j=1,a=i;j<=7;j++){
				if(j==5-i){
				    System.out.print(1);
				}
				else if(i==5 ||j==3+i){
					System.out.print(a++);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
/*
Full pyramid
    1
   232
  34543
 4567654
567898765
*/		
		System.out.println("Full pyramid");
           int cnt=0;
	       for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
				    System.out.print(++cnt);
				   else
					System.out.print(--cnt);
				}
              else{
				  System.out.print(" ");
			  }				
			}
			System.out.println();
		}
  /*
  Hollow Full Pyramid.
12345
2  5
3 5
45
5
  */   
		System.out.println("Hollow Full Pyramid.");
		for(int i=1;i<=5;i++){
			for(int j=1,a=i;j<=5;j++,a++){
				if(i==1 || j==1 || j==6-i){
				    System.out.print(a);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
/*
Hollow Full Pyramid.
1
12
1 3
1  4
12345
*/		
		System.out.println("Hollow Full Pyramid.");
		for(int i=1;i<=5;i++){
			for(int j=1,a=1;j<=5;j++,a++){
				if(i==5 || j==1 || i==j){
				    System.out.print(a);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
/*
Hollow Full Pyramid
    1
   1 2
  1   3
 1     4
1 2 3 4 5
*/	
		System.out.println("Hollow Full Pyramid");
		int temp=2;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==4+i){
					System.out.print(i);	
				}
				else if(j==6-i){
					System.out.print(1);
				}
				else if(i==5 && j%2!=0){
					System.out.print(temp++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
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
Full pyramid
1
121
12321
1234321
123454321
*/
		System.out.println("Full pyramid");
           
	       for(int i=1;i<=5;i++){
			   int c=0;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
				    System.out.print(++c);
				else
					System.out.print(--c);
				}		
			}
			System.out.println();
		}
/*
Triangle with Numbers
   1
  2 3
 4 5 6
7 8 9 10
*/	
		System.out.println("Triangle with Numbers");
		int t=1;
		for(int i=1;i<=4;i++){
			boolean flag=true;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i && flag){
					System.out.print(t++);
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
				}
				
			}
			System.out.println();
		}
/*
Different Half Diamonds
3
44
555
6666
555
44
3
*/	
		System.out.println("Different types of Half Diamonds");
		
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if((i>=j && i<=4)){
					System.out.print(i+2);
				}
				else if((j<=8-i && i>=5))
				{
					System.out.print(8-i+2);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Print following Pyramid");
		for(int i=1; i<=5; i++)
		{
			boolean flag=true;
			for(int j=1; j<=10; j++)
			{
				if(j<=i)
					if(j%2==0)
					System.out.printf("1");
				    else
					System.out.printf("0");
				else if(j>=11-i)
					if(j>=11-i && flag){
					System.out.printf("0");
				    flag=false;
					}
				    else{
					System.out.printf("1");	
				    flag=true;
					}
				else
					System.out.printf(" ");
				
			}	
			System.out.printf("\n");
		}
/*
Print following Pyramid
1        1
12      21
123    321
1234  4321
1234554321
*/		
		System.out.println("Print following Pyramid");
		for(int i=1; i<=5; i++)
		{
			boolean flag=true;
			for(int j=1,aa=0; j<=10; j++)
			{
				if(i>=j){
					System.out.print(++aa);
				}
				else if(j>=11-i){
                    System.out.print(aa--);
				}
				else
					System.out.printf(" ");
				
			}	
			System.out.printf("\n");
		}
/*
Print following Pyramid
123454321
1234321
12321
121
1
*/	
		System.out.println("Print following Pyramid");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1,xx=0; j<=10; j++)
			{
				if(j>=i && j<=10-i){
					if(j<=5){
					System.out.print(++xx);
				    }
					else{
						System.out.print(--xx);
					}
				}	
			}	
			System.out.printf("\n");
		}
		

		
	}	
}