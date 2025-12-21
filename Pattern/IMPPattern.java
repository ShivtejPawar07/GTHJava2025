
 class Pattern{
	public static void main(String x[]){
/*
Mixed pyramid
1
2*2
3*3*3
4*4*4*4
3*3*3
2*2
1
*/	

		System.out.println("Mixed pyramid ");	
	    for(int i=1;i<=7;i++){
			int n=(i<=4)?i:8-i;
			for(int j=1;j<=n;j++){
				System.out.print(n);
				if(j!=n){
					System.out.print("*");
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
 3*3*3
  2*2
   1	
	
*/
		for (int i = 1; i <= 7; i++) {

            int n = (i <= 4) ? i : 8 - i;     // 1,2,3,4,3,2,1
            int spaces = 4 - n;              // leading spaces

            // print spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // print pattern values
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
                if (j != n) System.out.print("*");
            }

            System.out.println();
        }
		/*Mixed Pattern
1
2*3
4*5*6
7*8*9*10
*/
	System.out.println("Mixed pyramid ");	
	int xx=1;
	    for(int i=1;i<=4;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(xx++);
				if(j!=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}

/*Mixed Pattern
1
2*3
4*5*6
7*8*9*10
4*5*6
2*3
1
*/      int a = 1, b = 0;

        for (int i = 1; i <= 7; i++) {

            int limit = (i <= 4) ? i : 8 - i;   // 1,2,3,4,3,2,1

            if (i <= 4) {
                // Upper part
                for (int j = 1; j <= limit; j++) {
                    System.out.print(a++);
                    if (j != limit) System.out.print("*");
                }
            } else {
                // Lower part → starting values
                if (i == 5) b = 7;
                else if (i == 6) b = 4;
                else if (i == 7) b = 2;

                for (int j = 1; j <= limit; j++) {
                    System.out.print(b++);
                    if (j != limit) System.out.print("*");
                }
            }

            System.out.println();
        }
/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
		for(int i=1;i<=9;i++){
			for(int j=1;j<=10;j++){
				if( ((j<=i || j>=11-i) && i<=5 ) ||( (j<=10-i || j>=i+1) && i>=6 )){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
1        5
12      45
123    345
1234  2345
1234512345
1234  2345
123    345
12      45
1        5
*/	
		 

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {

				// Upper part (i <= 5)
				if (i <= 5) {
					if (j <= i || j >= 11 - i) {
						System.out.print((j <= 5) ? j : j - 5);
					} else {
						System.out.print(" ");
					}
				}

				// Lower part (i >= 6)
				else {
					if (j <= 10 - i || j >= i + 1) {
						System.out.print((j <= 5) ? j : j - 5);
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

/*
A
BAB
CBABC
DCBABCD
EDCBABCDE*/
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1, aa = 65 + i - 1; j <= 9; j++) {

				if (j <= i * 2 - 1) {
					if (j <= i)
						System.out.print((char) aa++);
					else
						System.out.print((char) aa--);
				}
			}
			System.out.println();
		}
/*	1 A 2 B 3
	 C 4 D 5
	  E 6 F
	 7 G 8 H
    9 I 10 J 11 
*/		
	}
 }

