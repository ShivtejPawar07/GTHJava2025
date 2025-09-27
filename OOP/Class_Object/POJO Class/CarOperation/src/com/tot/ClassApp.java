package com.tot;

public class ClassApp {
	public static void main(String[] x) {
		    Car[] cars = new Car[5];
		   /* for (int i = 0; i < cars.length; i++) {
	            System.out.println("Enter details for Car " + (i + 1) + ":");

	            System.out.print("Car ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); // consume leftover newline

	            System.out.print("Model: ");
	            String model = sc.nextLine();

	            System.out.print("Fuel Consumed (litres): ");
	            float fuel = sc.nextFloat();

	            System.out.print("Distance Travelled (km): ");
	            float distance = sc.nextFloat();

	            // Create Car object
	            cars[i] = new Car(id, model, fuel, distance);
	            System.out.println("---------------------------");
	        } */
	        // Initialize each car object
	        cars[0] = new Car(1, "Swift", 50.5f, 600.0f);
	        cars[1] = new Car(2, "Baleno", 40.0f, 500.0f);
	        cars[2] = new Car(3, "Innova", 70.0f, 800.0f);
	        cars[3] = new Car(4, "Creta", 55.0f, 650.0f);
	        cars[4] = new Car(5, "XUV700", 65.0f, 750.0f);
	        
	        ClassOper co=new ClassOper();
	        co.accept(cars);
	        co.show();
	        co.calMileage();
	        co.bestMileage();
	        co.avgMileage();
	        }
}
