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
Hollow Rectangle
1
12
1 3
1  4
12345
*/
		System.out.println("Hollow Rectangle");
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
Full Pyramid or Center-Aligned Pyramid.
   1
  1 2
 1   3
1     4
*/
		
		System.out.println("Full Pyramid or Center-Aligned Pyramid.");
		for(int i=1;i<=5;i++){
			for(int j=1,a=i;j<=7;j++){
				if(j==5-i){
		
				    System.out.print(1);
				}
				else if(j==3+i){
					System.out.print(a++);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}	
}