/*13.Write a menu-driven program using switch and do-while to perform operations on a single character:
Check if the character is an alphabet.
If alphabet, check vowel or consonant.
Convert uppercase to lowercase or vice versa.
Exit the program
*/
import java.util.*;
class MD{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter the Char");
			char ch=sc.next().charAt(0);
		do{
			System.out.println("1:Check if the character is an alphabet");
			System.out.println("2:If alphabet,check vowel or consonant");
			System.out.println("3:Convert uppercase to lowercase ");
			System.out.println("4:Exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			
			switch(choice){
				case 1:
						if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
							System.out.println("character is an alphabet");
						else
							System.out.println("character is an Not alphabet");
						
				break;
				case 2:
						if(ch>='a' && ch<='z'){
						   ch=(char)(ch-32);
						}
				        if((ch=='A' ||ch=='E'||ch=='O'||ch=='U'||ch=='I'))
							System.out.println("character is an Vowel");
						else
							System.out.println("character is an Consonent");
						
				break;
				case 3:
				        if(ch>='a' && ch<='z'){
						   System.out.println("UpperCase="+(char)(ch-32));
						}
						else{
							System.out.println("LowerCase="+(char)(ch+32));
						}
						
						
				break;
				case 4:
						System.out.println("Thank you Visit again");
				break;
				
				default:
				System.out.println("Invalid Choice");
			}
		}while(choice!=4);
    }
}	
		