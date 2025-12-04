import java.util.*;

interface Convert {
    double convert(double value);
}

class CelsiusToFahrenheit implements Convert {
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}

class FahrenheitToCelsius implements Convert {
    public double convert(double value) {
        return (value - 32) * 5 / 9;
    }
}

class CelsiusToKelvin implements Convert {
    public double convert(double value) {
        return value + 273.15;
    }
}

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Convert[] conv = new Convert[10];
        double[] input = new double[10];
        double[] output = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter converter type:");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Celsius → Kelvin");
            int choice = sc.nextInt();

            System.out.println("Enter value to convert:");
            input[i] = sc.nextDouble();

            switch (choice) {
                case 1:
                    conv[i] = new CelsiusToFahrenheit();
                    break;
                case 2:
                    conv[i] = new FahrenheitToCelsius();
                    break;
                case 3:
                    conv[i] = new CelsiusToKelvin();
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to C → K");
                    conv[i] = new CelsiusToKelvin();
            }

            output[i] = conv[i].convert(input[i]);
        }

        // Print table
        System.out.println("\n---------------------------------------------");
        System.out.println(" Input Value\tConverted Value");
        System.out.println("---------------------------------------------");

        double max = output[0];
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %10.2f\t%15.2f\n", input[i], output[i]);
            if (output[i] > max)
                max = output[i];
        }

        System.out.println("---------------------------------------------");
        System.out.println("Highest converted value: " + max);
        System.out.println("---------------------------------------------");

        sc.close();
    }
}
