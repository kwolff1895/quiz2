package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TotalTuitionBill_Test {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After
	public void tearDown() throws Exception {
	
	}


	protected int Initial, Percent, APR, term, r, t, TotalCost;

	// assigning the values
	protected void setUp1() {
		Initial = 12520;
		Percent = (int) 0.25;
		APR = (int) .12;
		term = 4;
		r = APR / 12;
		t = term * 12;
		TotalCost = 25040;

	}

	// test methods
	@Test
	public void testTotalTuition() {
		double result = (Initial) * (1 + (Percent * t));
		assertTrue(result == 25040);

	}

	@Test
	public void MonthlyPayments() {
		double result = (TotalCost * r) / (1 - (Math.pow(1 + r, -t)));
		assertTrue(result == 659.4);

	}

}
