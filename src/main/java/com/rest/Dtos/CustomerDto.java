package com.rest.Dtos;

public class CustomerDto {
	private int accpountno;
	private int routingno;
	private String name;
	private String address;
	private String email;
	private double intitialAmount;

	public int getAccpountno() {
		return accpountno;
	}

	public void setAccpountno(int accpountno) {
		this.accpountno = accpountno;
	}

	public int getRoutingno() {
		return routingno;
	}

	public void setRoutingno(int routingno) {
		this.routingno = routingno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getIntitialAmount() {
		return intitialAmount;
	}

	public void setIntitialAmount(double intitialAmount) {
		this.intitialAmount = intitialAmount;
	}

	@Override
	public String toString() {
		return "CustomerDto [accpountno=" + accpountno + ", routingno=" + routingno + ", name=" + name + ", address="
				+ address + ", email=" + email + ", intitialAmount=" + intitialAmount + "]";
	}
	
	

}
