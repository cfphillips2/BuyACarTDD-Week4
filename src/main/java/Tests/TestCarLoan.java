package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarLoan;

public class TestCarLoan {

	Car Durango = new Car();
	CarLoan Customer1 = new CarLoan();
	
	@Before
	public void setUp () throws Exception {
		
	}
	
	@Test
	public void testCalculateCarLoan() {
		Durango.setPrice(36000);
		Durango.setMonths(60);
		double monthlyPay = Customer1.calculateCarLoan(Durango);
		assertEquals(600, monthlyPay, 0.0);
	}
	
	@Test
	public void testCalculateCarTax() {
		Durango.setPrice(36000);
		double carTax = Customer1.calculateCarTax(Durango);
		assertEquals(1521, carTax, 0.0);
	}
	
	@Test
	public void testCustHasGoodInterest() {
		Durango.setInterest(9);
		assertTrue(Customer1.customerInterest(Durango));
	}
	
	@Test
	public void testCustDoesNotHaveGoodInterest() {
		Durango.setInterest(11);
		assertFalse(Customer1.customerInterest(Durango));
	}
}
