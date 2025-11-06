/*Q3 pattern*/
class Patter{
	public static void main(String x[]){
System.out.println("Mixed pyramid ");	
	    for(int i=1;i<=7;i++){
			boolean flag=true;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i && flag && i<=4){
					System.out.print(i+" ");
				    flag=false;
			    }
                else if(j>=i-3 && j<=11-i && flag && i>4){
					System.out.print(8-i+" ");
				    flag=false;
				}
                else if((j>=5- i && j<=3+i && !flag && i<=4) ||(j>=i-3 && j<=11-i && !flag && i>4)) {
                    System.out.print("* ");
                 flag = true;
                } 								
			}
			System.out.println();
		}
	}
}	