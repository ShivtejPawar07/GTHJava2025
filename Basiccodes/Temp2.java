/*Q8. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
Formula :- fah = (cel * 9 / 5) + 32;
*/
public class Temp2
{
  public static void main(String []x)
  {
    float cel=Float.parseFloat(x[0]);
	System.out.println("farhint:"+(cel*9/5)+32);
  }
}

