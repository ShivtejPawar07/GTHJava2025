package com.tot;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("shivtej",10,20);
		Vehicle v2=new Vehicle("shivtej",10,20);
		VechicleCalculate vc=new VechicleCalculate();
		vc.accept(v1);
		vc.calculate();
	}

}
