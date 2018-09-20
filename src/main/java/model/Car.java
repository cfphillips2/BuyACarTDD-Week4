package model;

public class Car {

	private String car;
	private double price;
	private int months;
	private int interest;
	
	public Car() {
		
	}
	
	public Car(String carName) {
		this.car = carName;
	}
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	
}
