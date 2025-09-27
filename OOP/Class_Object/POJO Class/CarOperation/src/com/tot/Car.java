package com.tot;

public class Car {
    // Fields
    private int carId;
    private String model;
    private float fuelConsumed;
    private float distanceTravelled;

    // Constructor
    public Car(int carId, String model, float fuelConsumed, float distanceTravelled) {
        this.carId = carId;
        this.model = model;
        this.fuelConsumed = fuelConsumed;
        this.distanceTravelled = distanceTravelled;
    }

    // Getters
    public int getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public float getFuelConsumed() {
        return fuelConsumed;
    }

    public float getDistanceTravelled() {
        return distanceTravelled;
    }
}
