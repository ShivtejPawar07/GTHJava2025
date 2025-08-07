
class Pattern4{
	
	public static void main(String x[]){
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

		System.out.println(" print character pyramid ");
           int cnt=64;		
	       for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
				    System.out.print((char)++cnt);
				   else
					System.out.print((char)--cnt);
				}		
			}
			System.out.println();
		}

		
	}
}