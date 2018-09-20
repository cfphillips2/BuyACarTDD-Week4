package model;

import org.junit.Test;

public class CarLoan {
	
	private final double tax = 0.04225;
	
	public double calculateCarLoan(Car newCar) {
		double monthlyPay =  newCar.getPrice() / newCar.getMonths();
		return monthlyPay;
	}
	
	
	public double calculateCarTax(Car newCar) {
		double carTax = newCar.getPrice() * tax;
		return carTax;
	}
	
	public boolean customerInterest(Car newCar) {
		int interest = newCar.getInterest();
		boolean goodInterest = false;
		if(interest <= 10)
			goodInterest = true;
		else if(interest >= 10)
			goodInterest = false;
		
		return goodInterest;
	}

}
