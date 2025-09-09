
class Patern{
	public static void main(String x[]){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if((j>=5-i && j<=3+i && i<=4)||(j>=i-3 && j<=11-i && i>4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}