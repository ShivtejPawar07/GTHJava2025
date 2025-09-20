/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/
import java.util.*;
class TemperatureConverter {
    // Method to convert Celsius to Fahrenheit
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = converter.convertToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
