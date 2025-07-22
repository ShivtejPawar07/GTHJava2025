/*Q56. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.
*/
import java.util.*;
class Vowel{
   public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	char ch;
	do{
	System.out.println("enter the Character");
	ch=sc.nextLine().charAt(0);
	switch(ch){
	 case 'a','i','o','u','e','A','I','O','U','E':
	    System.out.println("Vowel");
		break;
		default:
		System.out.println("Consonent");
	}
	}while(ch!=1);
   }
}