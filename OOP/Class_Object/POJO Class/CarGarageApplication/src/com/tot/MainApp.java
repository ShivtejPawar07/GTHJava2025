package com.tot;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        // Create ServiceHistory
        ServiceHistory s1 = new ServiceHistory();
        s1.setPart("Clutch Repair");
        s1.setPrice(3000);

        ServiceHistory s2 = new ServiceHistory();
        s2.setPart("Oil Change");
        s2.setPrice(1500);

        ServiceHistory[] shArr = {s1, s2};

        // Create Car
        Car car = new Car();
        car.setId(201);
        car.setName("Aventador");  
        car.setComp("Lamborghini"); 
        car.setStatus(true);
        car.setServiceHistory(shArr);

        // Create Customer
        Customer cust1 = new Customer();
        cust1.setName("Shivtej Pawar");
        cust1.setEmail("shivtejpawar8@gmail.com");
        cust1.setContact("7757949545");
        cust1.setCar(car);

        // Put Customer in Register
        Customer[] custArr = {cust1};
        Register reg = new Register();
        reg.setCustomers(custArr);
        reg.setDate(new Date());

        // Create Service
        Service service = new Service();
        service.acceptVehicle(reg);
        service.serviceCar();

        // Print Total Bill
        System.out.println("\nTotal Bill: " + service.getTotalBill());
    }
}
