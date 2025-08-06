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
		
		System.out.println("Hollow Full Pyramid");
		for(int i=1;i<=6;i++){
			
			for(int j=1,a=1;j<=11;j++){
				if(j==7-i || j==5+i|| (i==6 && j%2!=0)){
					System.out.print(a);
					a++;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}	
}