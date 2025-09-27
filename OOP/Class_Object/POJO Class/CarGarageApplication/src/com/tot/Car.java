package com.tot;

public class Car {

    private int id;
    private String name;
    private String comp;
    private Boolean status;
    private ServiceHistory[] sh;  // array of ServiceHistory objects

    // Setter & Getter for id
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    // Setter & Getter for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Setter & Getter for comp
    public void setComp(String comp) {
        this.comp = comp;
    }
    public String getComp() {
        return comp;
    }

    // Setter & Getter for status
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Boolean getStatus() {
        return status;
    }

    // Setter & Getter for ServiceHistory array
    public void setServiceHistory(ServiceHistory[] sh) {
        this.sh = sh;
    }
    public ServiceHistory[] getServiceHistory() {
        return sh;
    }
}

