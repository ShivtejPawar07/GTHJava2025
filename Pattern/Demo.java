class Demo{
	public static void main(String x[]){
		for(int i=1;i<=7;i++){
			boolean flag=true;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i && i<=4 && flag ){
					System.out.print(i+" ");
					flag=false;
				}
				else if(j>=i-3 && j<=11-i &&i>4 && flag){
					System.out.print(8-i+" ");
					flag=false;
				}
				else if(j>=5-i && j<=3+i && i<=4 && !flag || j>=i-3 && j<=11-i &&i>4 && !flag){
					System.out.print("* ");
					flag=true;
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=7;i++){
			
			for(int j=1,a=1;j<=7;j++){
				if(j==5-i || j==3+i|| j==i-3 || j==11-i){
					System.out.print("* ");
					
				}
				else if((j>=6-i && j<=2+i && i>=2 && i<=4)||(j>=i-2 && j<=10-i && i>=5 && i<=6)){
					if(j<4){
						System.out.print(a++ +" ");
					}else{
						System.out.print(a-- +" ");
					}
				}
				
			}
			System.out.println();
		}
		for(int i=0;i<=7;i++){
			int n=1;
			for(int j=0;j<=7;j++){
				if(j<=i){
					System.out.print(n);
					n=n*(i-j)/(j+1);
				}
				
			}
			System.out.println();
		}
/*	#1
	#2
	#3#3
	#4#4
	#5#5#5
	#6#6#6
*/
		for(int i=1;i<=6;i++){
				int r=  i<=2?1:
						i<=4?2:
						3;
				for(int j=1;j<=r;j++){
						if(j<=i){
						System.out.print("#"+i);
						}
						
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
		for(int i=1;i<=5;i++){
			for(int j=1,a=65+i-1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<5){
				    System.out.print((char)a--);
					}
					else
						System.out.print((char)a++);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	/*
A B C D E F
 A B C D E
  A B C D
   A B C
    A B
     A
	*/
		for(int i=1;i<=6;i++){
			boolean flag=true;
			for(int j=1,a=65;j<=11;j++){
				if(j>=i && j<=12-i && flag){
					System.out.print((char)a++);
					flag=false;
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