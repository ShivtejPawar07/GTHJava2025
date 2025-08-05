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
		//System.out.println(------------------------------------------------);
		
		for(char i='A';i<='E';i++){
			for(char j='A';j<='E';j++){
				if(i<=j){
					System.out.print(j);
				}
			}
				System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1,a=65;j<=5;j++){
				if(i<=j){
					System.out.print((char)a++);
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1,a=65;j<=5;j++){
				if(i<=j && i%2!=0){
					System.out.print((char)a++);
				}
				else if(i<=j && i%2==0){
					System.out.print((char)(a+32));
					a++;
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1 || i==5  || j==6-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i<=j){
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1,a=1;j<=5;j++){
				if(i<=j){
					System.out.print(a++);
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1,a=1,b=0;j<=5;j++){
				if(j<=i && i%2!=0){
					System.out.print(a);
				}
				else if(j<=i && i%2==0){
					System.out.print(a-1);
					a=a+1;
				}
			}
			System.out.println();
		}
		
		
	}
}