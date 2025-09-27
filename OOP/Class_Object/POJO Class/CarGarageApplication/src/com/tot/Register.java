package com.tot;

import java.util.*;

public class Register {

    private Customer[] c;   
    private Date d;         

    // Setter & Getter for Customer array
    public void setCustomers(Customer[] c) {
        this.c = c;
    }
    public Customer[] getCustomers() {
        return c;
    }

   
    public void setDate(Date d) {
        this.d = d;
    }
    public Date getDate() {
        return d;
    }
}

