import java.util.*;

interface Transport {
    double calculateCharge(double distance, double weight);
}

abstract class Vehicle {
    int no;
    String name;

    Vehicle(int no, String name) {
        this.no = no;
        this.name = name;
    }

    abstract double fuelCost(double distance);
}

// ------------------ BIKE ------------------
class Bike extends Vehicle implements Transport {
    Bike(int no, String name) {
        super(no, name);
    }

    double fuelCost(double distance) {
        // 1 liter / 40 km  → price 110
        double liters = distance / 40.0;
        return liters * 110;
    }

    public double calculateCharge(double distance, double weight) {
        return 5 * distance;
    }
}

// ------------------ CAR ------------------
class Car extends Vehicle implements Transport {
    Car(int no, String name) {
        super(no, name);
    }

    double fuelCost(double distance) {
        // 1 liter / 15 km
        double liters = distance / 15.0;
        return liters * 110;
    }

    public double calculateCharge(double distance, double weight) {
        return 10 * distance;
    }
}

// ------------------ TRUCK ------------------
class Truck extends Vehicle implements Transport {
    Truck(int no, String name) {
        super(no, name);
    }

    double fuelCost(double distance) {
        // 1 liter / 6 km
        double liters = distance / 6.0;
        return liters * 110;
    }

    public double calculateCharge(double distance, double weight) {
        return (15 * distance) + (weight * 2);
    }
}

// ------------------ MAIN SYSTEM ------------------
class TransportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type: 1.Bike  2.Car  3.Truck");
        int type = sc.nextInt();

        System.out.println("Enter VehicleNo, DriverName, Distance, Weight:");
        int no = sc.nextInt();
        String name = sc.next();
        double dis = sc.nextDouble();
        double weight = sc.nextDouble();

        Transport t = null;
        Vehicle v = null;

        if (type == 1) {
            v = new Bike(no, name);
            t = (Transport) v;
        } else if (type == 2) {
            v = new Car(no, name);
            t = (Transport) v;
        } else if (type == 3) {
            v = new Truck(no, name);
            t = (Transport) v;
        } else {
            System.out.println("Invalid Type!");
            return;
        }

        double fuelCost = v.fuelCost(dis);
        double charge = t.calculateCharge(dis, weight);

        double finalAmount = charge + fuelCost;

        System.out.println("==================================");
        System.out.println("Vehicle No : " + no);
        System.out.println("Driver Name: " + name);
        System.out.println("Distance   : " + dis);
        System.out.println("Weight     : " + weight);
        System.out.println("Delivery Charge : " + charge);
        System.out.println("Fuel Cost       : " + fuelCost);
        System.out.println("Final Amount    : " + finalAmount);
        System.out.println("==================================");
    }
}
