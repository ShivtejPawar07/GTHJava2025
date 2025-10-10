class Pattern{
	public static void main(String x[]){
		/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
		*/
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j>=i && j<=10-i || j>=10-i && j<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

*/
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(((j<=6-i || j>=4+i)&& i<=5) || ((j<=i-4 || j>=14-i) && i>5)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
*/
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(((j<=i || j>=10-i) && i<=5) || ((j<=10-i || j>=i)&& i>5)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
*/
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==i || j==10-i || i==1|| i==9 || j==10-i || j==i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
    *
   * *
  *   *
 *  +  *
*   +   *
 *  +  *
  *   *
   * *
    *
*/
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((j==6-i || j==4+i) || (j==i-4 || j==14-i)){
					System.out.print("*");
				}
				else if(j==5 && i==4 || j==5 && i==5 || j==5 && i==6){
					System.out.print("+");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
    *
   * *
  *   *
 *     *
*********
*/
		System.out.println();
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if((j==6-i || j==4+i) || i==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
	1	
   212
  32123
 4321234
543212345
*/	
		System.out.println();
		for(int i=1;i<=5;i++){
			for(int j=1,a=1+i-1;j<=9;j++){
				if((j>=6-i && j<=4+i)){
					if(j<5)
						System.out.print(a--);
					else
						System.out.print(a++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15
*/		
		System.out.println();
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((j>=6-i)){
					System.out.print(n+++"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
/*
	1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
*/
		System.out.println();
		for(int i=1;i<=9;i++){
			boolean flag=true;
			for(int j=1,a=1;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=5 && flag) || (j>=i-4 && j<=14-i && i>5 && flag)){
					System.out.print(a++);
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
1   2
 3 4
  5
 6 7
8   9*/		
		
        System.out.println();
		int xx=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if((j==6-i || j==i)){
					System.out.print(xx++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
A   B
 C D
  E
 F G
H   I*/
		System.out.println();
		int xxx=65;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if((j==6-i || j==i)){
					System.out.print((char)xxx++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
	A
   BAB
  CBABC
 DCBABCD
EDCBABCDE
*/
		System.out.println();
		for(int i=1;i<=5;i++){
			for(int j=1,a=65+i-1;j<=9;j++){
				if((j>=6-i && j<=4+i)){
					if(j<5)
						System.out.print((char)a--);
					else
						System.out.print((char)a++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
    A
   A A
  A   A
 A     A
A       A
 A     A
  A   A
   A A
    A
*/		
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((j==6-i || j==4+i) || (j==i-4 || j==14-i)){
					System.out.print((char)65);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/	
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1,z=65;j<=9;j++){
				if(j>=i && j<=10-i || j>=10-i && j<=i){
					System.out.print((char)z++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

/*
    1
   A B
  2   3
 B     C
4 5 6 7 8
*/
		System.out.println();
		int nn=1,cc1=65,cc2=66;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i || j==4+i ||(i==5 && j%2!=0)){
					if(i%2!=0){
					System.out.print(nn++);
					}
					else{
						if(i==2)
							System.out.print((char)cc1++);
						else if(i==4)
							System.out.print((char)cc2++);
							
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}