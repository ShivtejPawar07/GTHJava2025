
class Pattern4{
	public static void main(String x[]){
/*
ABCDE
ABCD
ABC
AB
A
*/		System.out.println(" print character pyramid ");
		for(char i='A';i<='E';i++){
			for(char j='A',a='A';j<='E';j++){
				if(i<=j){
					System.out.print(a++);
				}
			}
				System.out.println();
		}
/*
 print character pyramid
A
AB
ABC
ABCD
ABCDE
*/
		System.out.println(" print character pyramid ");
		for(char i='A';i<='E';i++){
			for(char j='A';j<='E';j++){
				if(i>=j){
					System.out.print(j);
				}
			}
				System.out.println();
		}
/*
Full pyramid
A
ABC
ABCDC
ABCDEDC
ABCDEFEDC
*/	
	    System.out.println("Full pyramid");
	       for(int i=1;i<=5;i++){
			   int c=65;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
				    System.out.print((char)c++);
				else
					System.out.print((char)c--);
				}		
			}
			System.out.println();
		}
/*
print character pyramid
A
BC
DEF
GHIJ
KLMNO
*/	
		System.out.println(" print character pyramid ");
		 int a=65;
	       for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i>=j){
				    System.out.print((char)a++);		
			}
			
		  }
		  System.out.println();
		}
/*
 print character pyramid
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/
		System.out.println(" print character pyramid ");   
	       for(int i=1;i<=5;i++){
			for(int j=1,cnt=64;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
				    System.out.print((char)++cnt);
				   else
					System.out.print((char)--cnt);
				}		
			}
			System.out.println();
		}
/*
print character pyramid
ABCDEEDCB
ABCD DCBA
ABC   CBA
AB     BA
A       A
*/		
		System.out.println(" print character pyramid "); 
		for(int i=1; i<=5; i++)
		{
			for(int j=1,aa=64; j<=9; j++)
			{
				if(j<=6-i)
					System.out.printf("%c",(char)++aa);
				else if(j>=4+i)
					System.out.printf("%c",(char)aa--);
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
  /*
  print Char pyramid
    A
   BAB
  CBABC
 DCBABCD
EDCBABCDE
  */     
		System.out.println("print Char pyramid ");
          		
	       for(int i=1;i<=5;i++){
			for(int j=1,aa=65+i-1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<5)
				       System.out.print((char)aa--);
				    else
						System.out.print((char)aa++);
				}
                else{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
 /*
 print Char pyramid
A
BAB
CBABC
DCBABCD
EDCBABCDE
 */       
		
		System.out.println("print Char pyramid ");  		
	       for(int i=1;i<=5;i++){
			for(int j=1,aa=65+i-1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<5)
				       System.out.print((char)aa--);
				    else
						System.out.print((char)aa++);
				}				
			}
			System.out.println();
		}
/*
print Char pyramid
A B C D E F
 A B C D E
  A B C D
   A B C
    A B
     A
*/		
		System.out.println("print Char pyramid "); 
		for(int i=1;i<=6;i++){
			boolean flag=true;
			for(int j=1,q=65;j<=11;j++){
				if(j>=i && j<=12-i && flag){
				System.out.print((char)q++);
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