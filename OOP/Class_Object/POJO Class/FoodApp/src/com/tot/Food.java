package com.tot;

public class Food {
    // Data members
    private int fid;
    private String fname;
    private double fprice;
    private String fcategory;

    // Constructor
    public Food(int fid, String fname, double fprice, String fcategory) {
        this.fid = fid;
        this.fname = fname;
        this.fprice = fprice;
        this.fcategory = fcategory;
    }

    // Getter and Setter methods

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getFprice() {
        return fprice;
    }

    public void setFprice(double fprice) {
        this.fprice = fprice;
    }

    public String getFcategory() {
        return fcategory;
    }

    public void setFcategory(String fcategory) {
        this.fcategory = fcategory;
    }
}