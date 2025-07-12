/*Calculate age from year of birth
*/
import java.time.Year;
public class AgeOfBirth{
  public static void main(String []x){
        int birthYear = Integer.parseInt(x[0]);
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);

  }
}