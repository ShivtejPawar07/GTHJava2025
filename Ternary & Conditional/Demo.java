import java.util.*;
public class Demo{
 public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the char");
	char ch=sc.nextLine().charAt(0);
    System.out.println("before conversion:"+(char)ch);
	
	if(ch>=65 && ch<=90){
			ch=(char)(ch+32);
	}
	else{
		
		 ch=(char)(ch-32);
	}
		System.out.println("After conversion:"+(char)ch);		
 }

}