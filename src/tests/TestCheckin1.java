package tests;

import java.util.Date;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Registrant;

public class TestCheckin1 {
	String message = "Robert";
	//Date now = new Date();
	Registrant mary = new Registrant("Mary Cortez", "489678", new Date());

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside isCheckedIn()");
		assertFalse(mary.isCheckedIn() );
	}

	@Test
	public void testValidCheckinTime() {
		System.out.println("Checking if checkin time is before right now...");
		Date later = new Date();
		assertTrue( mary.getCheckinTime().before(later) );
	}
	
}
