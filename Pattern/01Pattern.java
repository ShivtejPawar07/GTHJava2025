/*Q1. Write a java program to print this pattern. 
 
A
ABC
ABCDC
ABCDEDC
ABCDEFEDC
 */
 class Pattern{
	public static void main(String x[]){
		System.out.println("Mixed pyramid ");	
	    for(int i=1;i<=5;i++){
			int ch=65;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					if(j<=5)
						System.out.print((char)ch++);
					else
						System.out.print((char)ch--);
				}
			}
			System.out.println();	
		}
	}
 }