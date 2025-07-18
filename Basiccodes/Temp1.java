/*Q7. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
Formula :- cel = (fah - 32) * 5 / 9
*/
public class Temp1
{
  public static void main(String []x)
  {
    float tem=Integer.parseInt(x[0]);
	System.out.println("celcius:"+(tem-32)*5/9);
	}
}