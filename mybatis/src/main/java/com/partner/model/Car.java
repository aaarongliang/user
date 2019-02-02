package com.partner.model;

public class Car 
{
	private String brand;
	private String brandNo;
	private float price;
	
	public Car() {
		super();
	}
	public Car(String brand, String brandNo, float price) {
		this.brand = brand;
		this.brandNo = brandNo;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrandNo() {
		return brandNo;
	}
	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return brand + "," + brandNo + "," + price;
	}

}
