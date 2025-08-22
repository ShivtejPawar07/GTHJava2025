class Pattern3{
	public static void main(String x[]){
		/*
Solid Rectangle
*****
*****
*****
		*/
		System.out.println("Solid Rectangle");
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
/*
Hollow Rectangle
*****
*   *
*****
*/
		System.out.println("Hollow Rectangle");
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || j==1 || i==3||j==5)
				    System.out.print("*");
			    else
					System.out.print(" ");
					
			}
			System.out.println();
		}
/*
Half Rectangle
*
**
***
****
*****
*/
		System.out.println("Half Rectangle");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=i)
				    System.out.print("*");
			}
			System.out.println();
		}
/*
Inverted Half Pyramid
*****
****
***
**
*
*/
		System.out.println("Inverted Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i<=j)
				    System.out.print("*");
			}
			System.out.println();
		} 
/*
Hollow Half Pyramid
*****
*  *
* *
**
*
*/
		System.out.println("Hollow Half Pyramid");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1 || i==1  || j==6-i){
				    System.out.print("*");
				}
				else{
					 System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Full Pyramid or Center-Aligned Pyramid.
    *
   ***
  *****
 *******
*********
*/	
		System.out.println("Full Pyramid or Center-Aligned Pyramid.");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
/*
Full Pyramid
    *
   * *
  * * *
 * * * *
* * * * *
*/
		System.out.println("Full Pyramid");
		for(int i=1;i<=5;i++){
			boolean flag=true;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i && flag){
					System.out.print("*");
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
Hollow Full Pyramid
     *
    * *
   *   *
  *     *
 *       *
* * * * * *
*/
		System.out.println("Hollow Full Pyramid");
		for(int i=1;i<=6;i++){
			
			for(int j=1;j<=11;j++){
				if(j==7-i || j==5+i|| (i==6 && j%2!=0)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Inverted full pyramid
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/
		System.out.println("Inverted full pyramid");
		for(int i=1;i<=6;i++){
			boolean flag=true;
			for(int j=1;j<=11;j++){
				if(j>=i && j<=12-i && flag){
					System.out.print("*");
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
Solid Diamond
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/
		System.out.println("Solid Diamond");
		for(int i=1;i<=9;i++){
			boolean flag=true;
			for(int j=1;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=5 &&flag) || (j>=i-4 && j<=14-i && i>5 && flag)){
					System.out.print("*");
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
	    
Solid Diamond
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
	*/
		System.out.println("Solid Diamond");
		for(int i=1;i<=10;i++){
			boolean flag=true;
			for(int j=1;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=6 &&flag) || (j>=i-5 && j<=15-i && i>6 && flag)){
					System.out.print("*");
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
		/*Hollow Diamnond
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
	   */
		System.out.println("Hollow Diamnond");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if( (j==6-i || j==4+i && i<=5 ) || (j==i-4 || j==14-i && i>5 )){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*Solid Half Diamnond
*
**
***
****
*****
****
***
**	
*
*/
        System.out.println("Solid Half Diamnond");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=5;j++){
				if((i>=j && i<=5)||(j<=10-i && i>5)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
/*
Hollow Diamond Inscribed in a Rectangle
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****
*/
        System.out.println("Hollow Diamond Inscribed in a Rectangle ");
		for(int i=1;i<=10;i++){
			for(int j=1;j<=11;j++){
				if((j<=6-i || j>=6+i && i<=5)||(j<=i-5 || j>=17-i && i>=6)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
/*
Solid Rombus
   ****
  ****
 ****
****
*/
        System.out.println("Solid Rombus");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=8-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Hollow Rombus
   ****
  *  *
 *  *
****
*/
        System.out.println("Hollow Rombus");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=7;j++){
				if(j==5-i || j==8-i || i==4 && j<=4 || i==1 && j>=4){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Diagonal and sides of rectangle
*******
**   **
* * * *
*  *  *
* * * *
**   **
*******
*/		
        System.out.println("Diagonal and sides of rectangle");
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i==1 || j==1 || i==7|| j==7|| j==8-i || i==j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Diagonal & Sides of a Rhombus/Diamond
*   *   *
 * * * *
  *   *
 * * * *
*   *   *
 * * * *
  *   *
 * * * *
*   *   *
*/	
		System.out.println("Diagonal & Sides of a Rhombus/Diamond");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if( (j==6-i || j==4+i && i<=5 ) || (j==i-4 || j==14-i && i>5 ) ||(i==j)||j==10-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Diagonal & Sides of a Rhombus/Diamond
    *
   ***
  * * *
 *  *  *
*********
 *  *  *
  * * *
   ***
    *
*/
		System.out.println("Diagonal & Sides of a Rhombus/Diamond");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if( (j==6-i || j==4+i && i<=5 ) || (j==i-4 || j==14-i && i>5 ) ||i==5||j==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	/*
	Butterfly Pattern Printing
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
		System.out.println("Butterfly Pattern Printing");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if( ((j<=i || j>=10-i) && i<=5 ) ||( (j<=10-i || j>=i) && i>=6 )){
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
Left Arrows
    *
     *
      *
       *
*********
       *
      *
     *
    *
*/
		System.out.println("Left Arrows");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==4+i || j==14-i || i==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Right Arrows
    *
   *
  *
 *
*********
 *
  *
   *
    *
*/		
		System.out.println("Right Arrows");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i ||j==i-4 || i==5 && j%2!=0){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Arrows
    *           *
     *         *
      *       *
       *     *
*********   ********
       *     *
      *       *
     *         *
    *           *
*/
	/*
	Solid Heart
 **   **
**** ****
*********
 *******
  *****
   ***
    *
	*/	
		System.out.println("Solid Heart");
		for(int i=1;i<=7;i++){
			for(int j=1;j<=9;j++){
				if((j>=3-i && j<=2+i &&i<=2)||(j>=8-i && j<=7+i && i<=2)||(j>=i-2 && j<=12-i && i>=3)){
					System.out.print("*");	
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
Hollow Heart
 **   **
*  * *  *
*   *   *
 *     *
  *   *
   * *
    *
*/	
		System.out.println("Hollow Heart");
		for(int i=1;i<=7;i++){
			for(int j=1;j<=9;j++){
				if(((j==3-i || j==2+i )&& i<=2)||((j==8-i || j==7+i)&& i<=2)||((j==i-2 || j==12-i) && i>=3)||(j==5 && i==3)){
					System.out.print("*");	
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

/*
Pattern
*
***
*****
*******
*********
*/
		System.out.println("Pattern");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j<=i*2-1){
				System.out.print("*");
				}
			}
			System.out.println();
		}
/*
Pattern
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
*/		
		System.out.println("Pattern");
		for(int i=1;i<=11;i++){
			boolean flag=true;
			for(int j=1;j<=11;j++){
				if((j>=i && j<=12-i && flag)||(j>=12-i && j<=i && flag)){
				System.out.print("*");
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