package com.tot;

public class ClassOper {
	Car[] cars;
	public void accept(Car...c) {
		this.cars=c;
	}
	public void show() {
		 for (int i = 0; i < cars.length; i++) {
	            System.out.println("Car ID: " + cars[i].getCarId());
	            System.out.println("Model: " + cars[i].getModel());
	            System.out.println("Fuel Consumed: " + cars[i].getFuelConsumed());
	            System.out.println("Distance Travelled: " + cars[i].getDistanceTravelled());
	            System.out.println("----------------------------------");
	        }
	}
	public void calMileage() {
		for (int i = 0; i < cars.length; i++) {
            System.out.println("Car ID: " + cars[i].getCarId());
            System.out.println("Model: " + cars[i].getModel());
            System.out.println("Fuel Consumed: " + cars[i].getFuelConsumed());
            System.out.println("Distance Travelled: " + cars[i].getDistanceTravelled());
            System.out.println("Mileage: " + cars[i].getDistanceTravelled()/cars[i].getFuelConsumed());
            System.out.println("----------------------------------");
        }
	}
	public void bestMileage() {
		Car bestcar=null;
		float max=0;
		for (int i = 0; i < cars.length; i++) {
			float m=cars[i].getDistanceTravelled()/cars[i].getFuelConsumed();
			if(m>max) {
				max=m;
				bestcar=cars[i];
			}
		
		}
		if(bestcar!=null) {

	            System.out.println("Car ID: " + bestcar.getCarId());
	            System.out.println("Model: " + bestcar.getModel());
	            System.out.println("Fuel Consumed: " + bestcar.getFuelConsumed());
	            System.out.println("Distance Travelled: " + bestcar.getDistanceTravelled());
	            System.out.println("Mileage: " + bestcar.getDistanceTravelled()/bestcar.getFuelConsumed());
	            System.out.println("----------------------------------");
	        
		}
		
	}
	public void avgMileage() {
		float sum=0;
		for (int i = 0; i < cars.length; i++) {
			float m=cars[i].getDistanceTravelled()/cars[i].getFuelConsumed();
			sum+=m;
		}
		System.out.println("Average mileage="+(sum/cars.length));
	}
}
