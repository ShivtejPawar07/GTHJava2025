/*Q3. Write a java program to print this pattern. 
 
 1 0 0 0 1 
 0 1 0 1 0 
 0 0 1 0 0 
 0 1 0 1 0 
 1 0 0 0 1*/
 
class Pattern{
	public static void main(String[]x){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j || j==6-i){
					System.out.print(1);
				}
				else{
					System.out.print(0);
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
			int a = 1;

		for (int i = 1; i <= 5; i++) {
			int ch = (i == 2) ? 64 : 65;  // reset char for each even row
			for (int j = 1; j <= 9; j++) {
				if ((j == 6 - i || j == 4 + i || (i == 5 && j % 2 != 0))) {
					if (i % 2 != 0) {
						System.out.print(a++);   // numbers
					} else {
						System.out.print((char) (++ch)); // characters
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
 1 
 3 3 3 
 5 5 5 5 5  
 3 3 3 
 1		
*/		
		for (int i = 1; i <= 5; i++) {
            int val = (i <= 3) ? (2 * i - 1) : (2 * (6 - i) - 1);
            for (int j = 1; j <= val; j++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


/*
	1 A 2 B 3
	 C 4 D 5
	  E 6 F
	 7 G 8 H
    9 I 10 J 11 

*/
		int tt=1,aa=65;
		for(int i=1;i<=5;i++){
			boolean flag=true;
			for(int j=1;j<=9;j++){
				if(j>=i && j<=10-i && i<=3&&flag || j>=6-i && j<=4+i && i>3 && flag){
					if (flag) {
                        if ((tt + aa) % 2 == 0) {
                            System.out.print(tt++);
                        } else {
                            System.out.print((char)aa++);
                        }
                        flag = false;
                    }
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