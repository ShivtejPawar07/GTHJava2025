/*Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.
*/
import java.util.*;
class VowelCon{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the char");
	  char ch=sc.nextLine().charAt(0);
	  
	   
	  if(ch=='A' || ch=='E' || ch=='O' || ch=='U'|| ch=='I' ||ch=='a' || ch=='e' || ch=='o' || ch=='u'|| ch=='i'){
	  System.out.println("Character is Vowel");
	  }
	  else {
	   System.out.println("Character is Cosonant");
	  }
   
   }
}
