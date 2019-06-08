package testNGFrameWork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeMethod
	public void UserGeneration() {
		System.out.println("User Generation");
	}
	
	@BeforeTest
	public void cookies() {
		System.out.println("Delete all cookies Before Browser");
	}
	@AfterTest
	public void cookiesclose() {
		System.out.println("Delete all cookies after completing all test");
	}
	@Test
	public void apenBrowser() {
		System.out.println("Browser Open");
	}

	@Test
	public void bFlightBooking() {
		System.out.println("Flight Booking");
	}
	@Test
	public void cPayment() {
		System.out.println("Check Payment Status");
	}
	@Test
	public void dEndTestCase() {
		System.out.println("Test Case End");
	}
}
