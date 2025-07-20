/*Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v

• 2nd data, Total number of wheels = W

The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.

Example :

Input : • 200 -> Value of V

• 540 -> Value of W

Output : • TW =130   FW=70

Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels*/

import java.util.*;

class VehicleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of vehicles: ");
        int V = sc.nextInt();

        System.out.print("Enter total number of wheels: ");
        int W = sc.nextInt();

        // Wheels must be even and at least 2*V
        if (W >= 2 * V && W <= 4 * V && W % 2 == 0) {
            int FW = (W - 2 * V) / 2;
            int TW = V - FW;

            System.out.println("Two-Wheelers = " + TW);
            System.out.println("Four-Wheelers = " + FW);
        } else {
            System.out.println("Invalid input. Please check the number of vehicles and wheels.");
        }
    }
}
