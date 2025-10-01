package com.tot;

public class Service {

    private Register r;

    // Accept Register object
    void acceptVehicle(Register r) {
        this.r = r;
    }

    // Show Service History of all Cars
    void serviceCar() {
        if (r == null || r.getCustomers() == null) {
            System.out.println("No customers or vehicles registered.");
            return;
        }

        System.out.println("Service Details");
        for (Customer cust : r.getCustomers()) {
            System.out.println("\nCustomer: " + cust.getName());
            System.out.println("Car: " + cust.getCar().getName() + " (" + cust.getCar().getComp() + ")");

            ServiceHistory[] shArr = cust.getCar().getServiceHistory();
            if (shArr != null && shArr.length > 0) {
                for (ServiceHistory sh : shArr) {
                    System.out.println("Part: " + sh.getPart() + " | Price: " + sh.getPrice());
                }
            } else {
                System.out.println("No service history available.");
            }
        }
    }

    // Calculate Total Bill of All Cars in Register
    int getTotalBill(Customer c) {
        int total = 0;

        if (r == null || r.getCustomers() == null) {
            return total;
        }

        for (Customer cust : r.getCustomers()) {
            ServiceHistory[] shArr = cust.getCar().getServiceHistory();
            if (shArr != null) {
                for (ServiceHistory sh : shArr) {
                    total += sh.getPrice();
                }
            }
        }

        return total;
    }
}
