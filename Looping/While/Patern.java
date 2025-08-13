class Patern{
	public static void main(String x[]){
		for(char i='A';i<='E';i++){
			for(char j='A',a='A';j<='E';j++){
				if(i<=j){
					System.out.print(a++);
				}
			}
				System.out.println();
		}
	}
}