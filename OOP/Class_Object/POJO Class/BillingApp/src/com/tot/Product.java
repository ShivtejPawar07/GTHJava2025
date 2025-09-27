package com.tot;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private int rate;
	private String compname;
	
	public Product(int pid,String pname,int qty,int rate,String compname) {
		this.pid=pid;
		this.pname=pname;
		this.qty=qty;
		this.rate=rate;
		this.compname=compname;
	}
	public int getpId() {
		return pid;
	}
	public String getpName() {
		return pname;
	}
	public int getQty() {
		return qty;
	}
	public int getRate() {
		return rate;
	}
	public String getCompName() {
		return compname;
	}
	public double getTotal() {
        return qty * rate;
    }

}
