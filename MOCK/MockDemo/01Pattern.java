/*
    1
   A B
  2   3
 B     C
4 5 6 7 8
*/
class Pattern{
	public static void main(String x){
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