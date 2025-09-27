package com.tot;

public class VechicleCalculate {
	Vehicle[]v;
	public void accept(Vehicle... v) {
		this.v=v;
	}
	public void calculate() {
		
		for(int i=0;i<v.length;i++) {
		System.out.println("far the vehicle can travel (mileage * fuelCapacity) "+(v[i].getMileage()*v[i].getFuleCapcity()));
		}
	}
}
