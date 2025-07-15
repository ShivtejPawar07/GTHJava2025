/*Write a java program to input any alphabet and check whether it is vowel or consonant.*/
import java.util.*;
public class Vowel{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the Alphabet");
	 char ch=sc.next().charAt(0);
	 String result=(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')?
	               "It is Vowel":"It is consonant";
	 System.out.println(result);
  
  }
}