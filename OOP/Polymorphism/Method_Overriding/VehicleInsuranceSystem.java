/*
Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05
Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%
Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.
Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array
*/


import java.util.*;

class Vehicle {
    String brand, model;
    float basePrice;

    Vehicle(String brand, String model, float basePrice) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
    }

    // parent method
    float calculatePremium() {
        return basePrice * 0.05f;
    }
}

class Car extends Vehicle {
    boolean hasAirbags;

    Car(String brand, String model, float basePrice, boolean hasAirbags) {
        super(brand, model, basePrice);
        this.hasAirbags = hasAirbags;
    }

    @Override
    float calculatePremium() {
        float base = super.calculatePremium();

        if (hasAirbags)
            return base + base * 0.12f;
        else
            return base + base * 0.05f;
    }
}

class Bike extends Vehicle {
    boolean hasABS;

    Bike(String brand, String model, float basePrice, boolean hasABS) {
        super(brand, model, basePrice);
        this.hasABS = hasABS;
    }

    @Override
    float calculatePremium() {
        float base = super.calculatePremium();

        if (hasABS)
            return base + base * 0.08f;
        else
            return base + base * 0.03f;
    }
}

public class VehicleInsuranceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle[] v = new Vehicle[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Vehicle Type (1.Car | 2.Bike): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            System.out.print("Base Price: ");
            float price = sc.nextFloat();

            if (type == 1) {
                System.out.print("Has Airbags? (true/false): ");
                boolean airbags = sc.nextBoolean();
                v[i] = new Car(brand, model, price, airbags);
            } else {
                System.out.print("Has ABS? (true/false): ");
                boolean abs = sc.nextBoolean();
                v[i] = new Bike(brand, model, price, abs);
            }
        }

        // Find vehicle with highest premium
        Vehicle maxVehicle = v[0];
        float maxPremium = v[0].calculatePremium();

        for (int i = 1; i < 5; i++) {
            float p = v[i].calculatePremium();
            if (p > maxPremium) {
                maxPremium = p;
                maxVehicle = v[i];
            }
        }

        System.out.println("\n=== Vehicle With Highest Premium ===");
        System.out.println("Brand: " + maxVehicle.brand);
        System.out.println("Model: " + maxVehicle.model);
        System.out.println("Premium: " + maxPremium);
    }
}
