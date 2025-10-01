package com.tot;

public class MainApp {
    public static void main(String[] args) {

        // 1. Create a Customer object
        Customer c = new Customer();
        c.setName("Shivtej");
        c.setEmail("shivtej@07");   
        c.setContact("7757949545");

        // 2. Create a Car object
        Car car = new Car();     
        car.setId(1);             
        car.setName("Honda City"); 
        car.setComp("Honda"); 
        car.setStatus(false);    

        car.setServiceHistory(new ServiceHistory[10]);


        c.setCar(car);

       
        Register.addCustomers(c);   

       
        Service.acceptVehicle(c);  

       
        Service.serviceCar(c);     

       
        System.out.println("Car Status: " + car.getStatus());

       
        System.out.println("Service History: " + car.getServiceHistory());

       
        double totalBill = Service.getTotalBill(c);
        System.out.println("Total Bill: " + totalBill);
    }
}
