package com.tot;

public class Vehicle {
	 private String model;
	 private int mileage;
	 private int fuelCapacity;
	 
	 public Vehicle(String model,int mileage,int fuelCapacity) {
		 this.model=model;
		 this.mileage=mileage;
		 this.fuelCapacity=fuelCapacity;
	 }
	 public String getModel() {
		 return model;
	 }
	 public int getMileage() {
		 return mileage;
	 }
	 public int getFuleCapcity() {
		 return fuelCapacity;
	 }

}
