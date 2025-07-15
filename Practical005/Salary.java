/*Write a Java program to calculate the net salary of an employee.

Input: basic salary, HRA %, DA %, and tax %.
*/
import java.util.*;

public class Salary {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        // Input: Basic Salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();

        // Input: HRA percentage
        System.out.print("Enter the HRA % of employee: ");
        double hraPercent = sc.nextDouble();

        // Input: DA percentage
        System.out.print("Enter the DA % of employee: ");
        double daPercent = sc.nextDouble();

        // Input: Tax percentage
        System.out.print("Enter the tax %: ");
        double taxPercent = sc.nextDouble();

        // Calculate HRA and DA amounts
        double hraAmount = (basicSalary * hraPercent) / 100;
        double daAmount = (basicSalary * daPercent) / 100;

        // Total gross salary
        double grossSalary = basicSalary + hraAmount + daAmount;

        // Tax amount to be deducted
        double taxAmount = (grossSalary * taxPercent) / 100;

        // Final net salary
        double netSalary = grossSalary - taxAmount;

        // Display results
        System.out.printf("\nGross Salary: %.2f", grossSalary);
        System.out.printf("\nTax Deducted: %.2f", taxAmount);
        System.out.printf("\nNet Salary: %.2f\n", netSalary);

        // Close scanner
        sc.close();
    }
}
