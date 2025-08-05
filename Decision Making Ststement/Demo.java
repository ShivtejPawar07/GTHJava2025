import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
		System.out.println("1.deposite");
		System.out.println("2.withdraw");
		System.out.println("3.current bal");
		System.out.println("4.exit");
		System.out.println("enter your choice");
		 ch=sc.nextInt();
		 float bal=0;
		switch(ch){
		case 1:
		        
            	System.out.println("Enter deposite amount");
                int dep=sc.nextInt();
				if(dep>0){
				  bal=bal+dep;
				 System.out.println("deposite succssfull");
			
				 
				}
				else{
					
					
				}
         break;	
         case 2:
          		System.out.println("Enter withdraw");
                int w=sc.nextInt();
                if(w>0 && bal>=w){
					bal=bal-w;
					System.out.println("deposite succssfull");
				}else{
					
				}			
		 }
		}while(ch!=3);
		
		
	}
}