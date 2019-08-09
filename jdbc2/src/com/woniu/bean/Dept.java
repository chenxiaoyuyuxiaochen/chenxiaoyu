package com.woniu.bean;

public class Dept {
	private int did;
	private String dname;
	private String address;
	
	public int getDid() {
		return did;
	}








	public void setDid(int did) {
		this.did = did;
	}








	public String getDname() {
		return dname;
	}








	public void setDname(String dname) {
		this.dname = dname;
	}








	public String getAddress() {
		return address;
	}








	public void setAddress(String address) {
		this.address = address;
	}

	






	public Dept() {
		super();
	}








	public Dept(int did, String dname, String address) {
		super();
		this.did = did;
		this.dname = dname;
		this.address = address;
	}








	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", address=" + address + "]";
	}








	
}
