/*Write a Java program to calculate the net salary of an employee.

Input: basic salary, HRA %, DA %, and tax %.
*/
import java.util.*;

public class NetSalary {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();//1000

        System.out.print("Enter the HRA % of employee: ");
        double hraPercent = sc.nextDouble();//12

        System.out.print("Enter the DA % of employee: ");
        double daPercent = sc.nextDouble();//6

        System.out.print("Enter the tax %: ");
        double taxPercent = sc.nextDouble();

        double hraAmount = (basicSalary * hraPercent) / 100;
        double daAmount = (basicSalary * daPercent) / 100;

        double grossSalary = basicSalary + hraAmount + daAmount;

        double taxAmount = (grossSalary * taxPercent) / 100;

        double netSalary = grossSalary - taxAmount;

        System.out.printf("\nGross Salary: %.2f", grossSalary);
        System.out.printf("\nTax Deducted: %.2f", taxAmount);
        System.out.printf("\nNet Salary: %.2f\n", netSalary);
    }
}
