// Superclass: Vehicle
class Vehicle {
    private String model;
    private String rno;
    private double speed;
    private double fCap;  // Fuel Capacity (liters)
    private double fCon;  // Fuel Consumption (km per liter)

    // Default Constructor
    Vehicle() {}

    // Parameterized Constructor
    Vehicle(String model, String rno, double speed, double fCap, double fCon) {
        this.model = model;
        this.rno = rno;
        this.speed = speed;
        this.fCap = fCap;
        this.fCon = fCon;
    }

    // ======== Getter and Setter Methods ========
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getRno() { return rno; }
    public void setRno(String rno) { this.rno = rno; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public double getFCap() { return fCap; }
    public void setFCap(double fCap) { this.fCap = fCap; }

    public double getFCon() { return fCon; }
    public void setFCon(double fCon) { this.fCon = fCon; }

    // ======== Member Methods ========

    // Calculates and returns fuel needed for a given distance
    double fuelNeeded(double distance) {
        double fuel = distance / fCon;
        return fuel;
    }

    // Calculates and returns distance covered for a given time
    double distanceCovered(double time) {
        double distance = speed * time;
        return distance;
    }

    // Display details
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Registration No: " + rno);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fCap + " liters");
        System.out.println("Fuel Consumption: " + fCon + " km/l");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double cargoWeightLimit; // in kg

    Truck() {}

    Truck(String model, String rno, double speed, double fCap, double fCon, double cargoWeightLimit) {
        super(model, rno, speed, fCap, fCon); // constructor chaining
        this.cargoWeightLimit = cargoWeightLimit;
    }

    public double getCargoWeightLimit() { return cargoWeightLimit; }
    public void setCargoWeightLimit(double cargoWeightLimit) { this.cargoWeightLimit = cargoWeightLimit; }

    @Override
    void display() {
        super.display(); // show Vehicle details
        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
    }
}

// Subclass: Bus
class Bus extends Vehicle {
    private int numberOfPassengers;

    Bus() {}

    Bus(String model, String rno, double speed, double fCap, double fCon, int numberOfPassengers) {
        super(model, rno, speed, fCap, fCon);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    @Override
    void display() {
        super.display();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

// Driver Class
class Transport {
    public static void main(String[] args) {
        // Truck Object
        Truck t = new Truck("Volvo FH16", "MH17AB1234", 120.5, 400, 5.0, 12000);
        System.out.println("===== Truck Details =====");
        t.display();
        System.out.println("Fuel Needed for 500 km: " + t.fuelNeeded(500) + " liters");
        System.out.println("Distance Covered in 6 hours: " + t.distanceCovered(6) + " km");

        System.out.println();

        // Bus Object
        Bus b = new Bus("Tata Marcopolo", "MH14XY5678", 80.0, 300, 6.0, 45);
        System.out.println("===== Bus Details =====");
        b.display();
        System.out.println("Fuel Needed for 500 km: " + b.fuelNeeded(500) + " liters");
        System.out.println("Distance Covered in 6 hours: " + b.distanceCovered(6) + " km");
    }
}
